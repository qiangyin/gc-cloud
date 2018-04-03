package com.cloudzone.common.utils;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Properties;


/**
 * @author tianyuliang
 * @since 2018/1/30
 */
public class UtilAll {

    //private static final Logger logger = LoggerFactory.getLogger(UtilAll.class);

    public static final String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

    public static final String yyyy_MM_dd_HH_mm_ss_SSS = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final String yyyy_MM_dd_HH_mm_ss_SSS_SSSSSS = "yyyy-MM-dd HH:mm:ss.SSSSSSSSS";

    public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";

    public static final String utcformatDefault = "yyyy-MM-dd'T'HH:mm:ss Z";

    public static final String utcformatSimple = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";

    public static final String utcformatFull = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS Z";

    public static SimpleDateFormat df = new SimpleDateFormat(yyyy_MM_dd_HH_mm_ss);
    public static SimpleDateFormat defaultFormat = new SimpleDateFormat(yyyy_MM_dd_HH_mm_ss_SSS);
    public static SimpleDateFormat defaultFull = new SimpleDateFormat(yyyy_MM_dd_HH_mm_ss_SSS_SSSSSS);


    public static SimpleDateFormat utcFormatDefault = new SimpleDateFormat(utcformatDefault);
    public static SimpleDateFormat utcFormatSimple = new SimpleDateFormat(utcformatSimple);
    public static SimpleDateFormat utcFormatFull = new SimpleDateFormat(utcformatFull);


    public static int getPid() {
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        // format: "pid@hostname"
        String name = runtime.getName();
        try {
            return Integer.parseInt(name.substring(0, name.indexOf('@')));
        } catch (Exception e) {
            return -1;
        }
    }


    public static String currentStackTrace() {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement ste : stackTrace) {
            sb.append("\n\t");
            sb.append(ste.toString());
        }
        return sb.toString();
    }


    /**
     * 计算耗时操作，单位ms
     */
    public static long computeTime(final long beginTime) {
        return (System.currentTimeMillis() - beginTime);
    }

    public static String encodeUrl(String url, String encode) {
        try {
            return URLEncoder.encode(url, encode);
        } catch (UnsupportedEncodingException e) {
            System.out.println("UnsupportedEncodingException: " + e.getMessage());
            e.printStackTrace();
            return url;
        }
    }

    public static boolean isItTimeToDo(final String when) {
        String[] whiles = when.split(";");
        if (whiles != null && whiles.length > 0) {
            Calendar now = Calendar.getInstance();
            for (String w : whiles) {
                int nowHour = Integer.parseInt(w);
                if (nowHour == now.get(Calendar.HOUR_OF_DAY)) {
                    return true;
                }
            }
        }

        return false;
    }


    public static String timeMillisToHumanString() {
        return timeMillisToHumanString(System.currentTimeMillis());
    }


    public static String timeMillisToHumanString(final long t) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(t);
        return String
                .format("%04d%02d%02d%02d%02d%02d%03d", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
                        cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.HOUR_OF_DAY),
                        cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND), cal.get(Calendar.MILLISECOND));
    }


    public static long computNextMorningTimeMillis() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.add(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTimeInMillis();
    }


    public static long computNextMinutesTimeMillis() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.add(Calendar.DAY_OF_MONTH, 0);
        cal.add(Calendar.HOUR_OF_DAY, 0);
        cal.add(Calendar.MINUTE, 1);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTimeInMillis();
    }


    public static long computNextHourTimeMillis() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.add(Calendar.DAY_OF_MONTH, 0);
        cal.add(Calendar.HOUR_OF_DAY, 1);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTimeInMillis();
    }


    public static long computNextHalfHourTimeMillis() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.add(Calendar.DAY_OF_MONTH, 0);
        cal.add(Calendar.HOUR_OF_DAY, 1);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTimeInMillis();
    }


    public static String timeMillisToHumanString2(final long t) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(t);
        return String.format("%04d-%02d-%02d %02d:%02d:%02d,%03d",
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE),
                cal.get(Calendar.SECOND),
                cal.get(Calendar.MILLISECOND));
    }


    /**
     * 返回日期时间格式，精度到秒<br>
     * 格式如下：2013122305190000
     *
     * @param t
     * @return
     */
    public static String timeMillisToHumanString3(final long t) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(t);
        return String.format("%04d%02d%02d%02d%02d%02d",
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE),
                cal.get(Calendar.SECOND));
    }


    public static int asInt(String str, int defaultValue) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return defaultValue;
        }
    }


    public static long asLong(String str, long defaultValue) {
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static String formatDefaultDate(Long time) {
        return defaultFormat.format(new Date(time));
    }

    public static String formatDate(Date date, String pattern) {
        return df.format(date);
    }

    public static long parseDateToLong(String strDate) {
        try {
            Date date = defaultFormat.parse(strDate);
            return date == null ? 0 : date.getTime();
        } catch (ParseException e) {
            return 0;
        }
    }

    public static Date parseDate(String date, String pattern) {
        try {
            return df.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String utcToLocalDefault(String utcTime) {
        try {
            String utcString = utcTime.replace("Z", " UTC");
            Date date = utcFormatDefault.parse(utcString);
            return df.format(date.getTime());
        } catch (ParseException pe) {
            pe.printStackTrace();
            return null;
        }
    }

    public static String utcToLocalMillis(String utcTime) {
        try {
            String utcString = utcTime.replace("Z", " UTC");
            Date date = utcFormatSimple.parse(utcString);
            return defaultFormat.format(date.getTime());
        } catch (ParseException pe) {
            pe.printStackTrace();
            return null;
        }
    }

    public static String utcToLocalNanosecond(String utcTime) {
        // 把“2018-03-15T10:22:18.274451807Z” 转化为“2018-03-15T10:22:18.274Z”
        // 把“2018-03-15T10:37:31.6811455Z” 转化为“2018-03-15T10:37:31.681Z”
        // 把“2018-03-15T10:37:31.681145Z” 转化为“2018-03-15T10:37:31.681Z”
        String utcMillTime = utcTime.substring(0, 23) + String.valueOf(utcTime.charAt(utcTime.length() - 1));
        return utcToLocalMillis(utcMillTime);
    }

    public static String frontStringAtLeast(final String str, final int size) {
        if (str != null) {
            if (str.length() > size) {
                return str.substring(0, size);
            }
        }
        return str;
    }

    public static boolean isEquals(String v1, String v2) {
        if (isBlank(v1) && isBlank(v2)) {
            return true;
        }
        if (isBlank(v1) || isBlank(v2)) {
            return false;
        }
        return v1.trim().equals(v2.trim());
    }

    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    public static String getFileExtName(String fileName) {
        if (isBlank(fileName) || fileName.length() <= 3) {
            return "";
        }
        int index = fileName.trim().lastIndexOf(".");
        return fileName.trim().substring(index + 1);
    }


    public static String getValueTrim(final String str) {
        return isBlank(str) ? "" : str.trim();
    }

    public static String clearNewLine(final String str) {
        if (isBlank(str)) {
            return "";
        }

        String newString = str.trim();
        int index = newString.indexOf("\r");
        if (index != -1) {
            return newString.substring(0, index);
        }

        index = newString.indexOf("\n");
        if (index != -1) {
            return newString.substring(0, index);
        }

        return newString;
    }


    public static String[] split(final String str, String regex) {
        String newString = str.trim();
        String[] s = newString.split(regex);
        return s.length > 0 ? s : null;
    }


    public static boolean isBlank(Object object) {
        if (object instanceof String) {
            if (object == null || (((String) object).length()) == 0) {
                return true;
            }
        }
        if (object instanceof Collection) {
            if (null == object || ((Collection) object).isEmpty()) {
                return true;
            }
        }
        if (object instanceof String[]) {
            if (null == object || ((String[]) object).length <= 0) {
                return true;
            }
        }
        return false;
    }


    public static boolean isLengthBeyond(Object object, int maxLength) {
        byte[] bytes = JSON.toJSONBytes(object);
        return bytes.length > maxLength ? true : false;
    }


    /**
     * 从配置文件获取配置项value
     */
    public static String getValue4Properties(String propertiesName, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = UtilAll.class.getClassLoader().getResourceAsStream(propertiesName);
            properties.load(inputStream);
            return properties.getProperty(key);
        } catch (IOException e) {
            String errMsg = "get propertiesName=" + propertiesName + ", key=" + key + " err";
            System.out.println(errMsg);
            throw e;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception ex) {
                }
            }
        }
    }


    public static String readFile(String fileName) throws IOException {
        String value = "";
        InputStream inputStream = null;
        try {
            inputStream = UtilAll.class.getClass().getResourceAsStream("/" + fileName);
            value = IOUtils.toString(inputStream, "UTF-8");
        } catch (IOException e) {
            throw e;
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        return value;
    }


    /**
     * 验证字符串能否转换为整数
     */
    public static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(getFileExtName("Desktop.pdf") + "\n");

        System.out.println(isEquals(null, "11"));
        System.out.println(isEquals("", "11"));
        System.out.println(isEquals("22", "22"));
        System.out.println(isEquals(null, null));
        System.out.println(isEquals(null, ""));
        System.out.println(isEquals("   ", "\t"));

        System.out.println(utcToLocalDefault("2018-01-24T09:02:19Z"));
        System.out.println(utcToLocalMillis("2018-03-15T08:07:56.762Z"));
        System.out.println(utcToLocalNanosecond("2018-03-15T08:07:56.762599539Z"));
        System.out.println(utcToLocalNanosecond("2018-03-15T10:37:31.6811455Z"));
        System.out.println(utcToLocalNanosecond("2018-03-15T10:37:31.681145Z"));

        System.out.println();

    }


}
