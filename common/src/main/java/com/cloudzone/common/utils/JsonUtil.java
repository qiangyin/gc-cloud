package com.cloudzone.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;


/**
 * @author tianyuliang
 * @since 2018/3/15
 */
@SuppressWarnings("rawtypes")
public class JsonUtil {


    /**
     * 将Java对象转换成JSON字符串
     */
    public static String toJSONString(Object object) {
        return JSON.toJSONString(object, features);
    }

    /**
     * 定制json输出格式
     * 1 时间格式化 <br/>
     * 2 输出Map空置字段 <br/>
     * 3 list字段如果为null，输出为[]，而不是null <br/>
     * 4 字符类型字段如果为null，输出为""，而不是null <br/>
     * 5 bool性输出为false <br/>
     */
    private static final SerializerFeature[] features = {
            SerializerFeature.WriteDateUseDateFormat,
            SerializerFeature.WriteMapNullValue,
            SerializerFeature.WriteNullListAsEmpty,
            SerializerFeature.WriteNullStringAsEmpty,
            SerializerFeature.WriteNullBooleanAsFalse,
    };

    /**
     * 将Java对象转换成JSON字符串
     * <p>
     * <pre>
     *     - 注意事项: 对象中值为null的字段将被过滤掉
     * </pre>
     *
     * @param object 待转换为JSON字符串的Java对象
     * @return 转换后的JSON字符串
     * @author tianyuliang
     */
    public static String toDefaultString(Object object) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object source, String name, Object value) {
                return value != null ? true : false;
            }
        };
        SerializeWriter out = new SerializeWriter();
        JSONSerializer serializer = new JSONSerializer(out);
        serializer.getPropertyFilters().add(filter);
        serializer.write(object);
        return out.toString();
    }

    /**
     * 将JSON字符串转换为普通Java对象（非数组、无泛型）
     * <p>
     * <pre>
     *     - 应用场景: 转换为普通Java对象（非数组、无泛型）
     * </pre>
     *
     * @param jsonText JSON字符串
     * @param <T>      Java对象类型
     * @param clazz    Java对象类型的类对象
     * @return 转化后的Java对象
     * @author tianyuliang
     */
    public static <T> T toObject(String jsonText, Class<T> clazz) {
        T result = null;
        try {
            result = JSON.parseObject(unifiedEmptyJSON(jsonText), clazz);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 将JSON字符串转换为泛型Java对象。
     * <p>
     * <pre>
     *     - 应用场景: 转换为泛型Java对象
     * </pre>
     *
     * @param jsonText JSON字符串
     * @param <T>      泛型对象类型
     * @param type     泛型对象的类对象
     * @return 转化后的泛型对象
     * @author tianyuliang
     */
    public static <T> T toGenericsObject(String jsonText, TypeReference<T> type) {
        T result = null;
        try {
            result = JSON.parseObject(unifiedEmptyJSON(jsonText), type);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 将JSON字符串转换为List对象
     * <p>
     * <pre>
     *     - 应用场景: 转化为List对象
     * </pre>
     *
     * @param jsonText  JSON字符串
     * @param <T>       List集合中子项的类型
     * @param itemClazz List集合中子项的类对象
     * @return JSON转化后的List对象
     * @author tianyuliang
     */
    public static <T> List<T> toListObject(String jsonText, Class<T> itemClazz) {
        List<T> result = null;
        try {
            result = JSON.parseArray(unifiedEmptyJSON(jsonText), itemClazz);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 替换指定位置的JSON字符串。
     * <p>
     * <pre>
     *     - 应用场景: 需要将一个JSON字符串嵌入到另一个JSON中。
     * </pre>
     *
     * @param json        被嵌入的源JSON
     * @param placeHolder 源JSON中的占位符
     * @param value       待嵌入的子JSON
     * @return 嵌入后的新JSON
     * @author tianyuliang
     */
    private static String mountSegment(String json, String placeHolder, String value) {
        return replace(json, "\"" + placeHolder + "\"", value);
    }


    /**
     * 替换字符串中的某段子字符串为新的指定值
     *
     * @param source 源字符串
     * @param from   目标字符值
     * @param to     新的指定值
     * @return 替换后的字符串
     * @author tianyuliang
     */
    private static String replace(String source, String from, String to) {
        if (source == null) {
            return null;
        }
        int index = source.indexOf(from);
        if (-1 != index && null != from && !from.isEmpty() && null != to) {
            StringBuilder result = new StringBuilder();
            String prefix = source.substring(0, index);
            String suffix = source.substring(index + from.length());
            return result.append(prefix).append(to).append(suffix).toString();
        } else {
            return source;
        }
    }


    /**
     * 将空白的JSON文本统一为"{}"。
     *
     * @param jsonText 原JSON文本
     * @return 统一后的JSON文本
     * @author tianyuliang
     */
    private static String unifiedEmptyJSON(String jsonText) {
        if (null == jsonText || jsonText.isEmpty()) {
            return "{}";
        } else {
            return jsonText;
        }
    }

}
