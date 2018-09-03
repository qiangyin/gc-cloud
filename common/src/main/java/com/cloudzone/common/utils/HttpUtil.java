package com.cloudzone.common.utils;


import com.cloudzone.common.exception.HttpException;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.Charset;


/**
 * Http工具类
 *
 * @author tongqiangying@gmail.com
 * @since 2018/3/15
 */
public class HttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    public static final String DEFAULT_ENCODING = "UTF-8";

    public static final Integer TIMEOUT_MILLS = 20 * 1000;


    public enum MethodType {

        GET("GET"),

        POST("POST");

        private String methodName;


        MethodType(String methodName) {
            this.methodName = methodName;
        }

        public String getMethodName() {
            return methodName;
        }
    }


    /**
     * <ul>
     * <li>1、发送HTTP请求(json数据)</li>
     * <li>2、可适当优化SocketTimeoutException异常，增加100ms后重试，即重新调用接口的机制</li>
     * </ul>
     *
     * @param methodType     枚举类型 Get/Post
     * @param requestUrl     请求Url
     * @param requestData    请求参数(json/xml字符串)
     * @param timeoutInMills 超时时间(ms)
     * @return 响应体的字符串
     * @throws HttpException
     */
    public static String send(MethodType methodType, String requestUrl, String requestData, int timeoutInMills) throws HttpException {
        String ret = "";
        URL topUrl = null;
        HttpURLConnection http = null;
        long s = System.currentTimeMillis();
        try {
            topUrl = new URL(requestUrl);
            http = (HttpURLConnection) topUrl.openConnection();
            http.setDoInput(true);
            http.setDoOutput(true);
            http.setUseCaches(false);
            http.setRequestProperty("Content-type", "application/json; charset=" + DEFAULT_ENCODING);
            http.setRequestMethod(methodType.getMethodName());
            if (timeoutInMills > 0) {
                // 建立连接的超时时间
                http.setConnectTimeout(TIMEOUT_MILLS);

                // 等待服务器响应超时时间
                http.setReadTimeout(TIMEOUT_MILLS);
            }
            http.connect();

            if (requestData != null && !"".equals(requestData.trim())) {
                // 写数据
                write(http.getOutputStream(), requestData);
            }
            if (methodType.getMethodName().equals(MethodType.POST)) {
                logger.info("THIRD-REQUEST(HTTP):\t\t{}\n\t{}", requestUrl, requestData);
            } else {
                logger.info("THIRD-REQUEST(HTTP):\t\t{}", requestUrl);
            }

            if (http.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // 读数据
                ret = read(http.getInputStream());
            }
            // logger.info("{} ms elapsed, THIRD-RESPONSE(HTTP):\t{}\n\t{}", UtilAll.computeTime(s), requestUrl, ret);

        } catch (SocketTimeoutException e) {
            throw new HttpException(e);
        } catch (MalformedURLException e) {
            throw new HttpException(e);
        } catch (IOException e) {
            throw new HttpException(e);
        } catch (Exception e) {
            throw new HttpException(e);
        } finally {
            if (http != null) {
                try {
                    http.disconnect();
                } catch (Exception e) {
                    logger.error("http disconnect failed.", e);
                }
            }
        }
        return ret;
    }


    /**
     * get请求
     *
     * @param requestUrl
     * @param requestData
     * @return
     * @throws HttpException
     */
    public static String get(String requestUrl, String requestData) throws HttpException {
        return send(MethodType.GET, requestUrl, requestData, TIMEOUT_MILLS);
    }


    /**
     * post请求
     *
     * @param requestUrl
     * @param requestData
     * @return
     * @throws HttpException
     */
    public static String post(String requestUrl, String requestData) throws HttpException {
        return send(MethodType.POST, requestUrl, requestData, TIMEOUT_MILLS);
    }


    /**
     * Write to OutputStream
     *
     * @param os
     * @param data
     */
    private static void write(OutputStream os, String data) {
        try {
            os.write(data.getBytes(Charset.forName(DEFAULT_ENCODING)));
            os.flush();
        } catch (Exception e) {
            logger.error("close outputStream failed.", e);
        } finally {
            IOUtils.closeQuietly(os);
        }
    }


    /**
     * Read from InputStream
     *
     * @param is
     * @return
     */
    public static String read(InputStream is) {
        if (is == null) {
            return "";
        }
        ByteArrayOutputStream bos = null;
        try {
            bos = new ByteArrayOutputStream();
            int r;
            byte[] b = new byte[1024];
            while ((r = is.read(b, 0, b.length)) != -1) {
                bos.write(b, 0, r);
            }
            return new String(bos.toByteArray(), DEFAULT_ENCODING);
        } catch (Exception e) {
            logger.error("close inputStream failed.", e);
        } finally {
            IOUtils.closeQuietly(is);
            IOUtils.closeQuietly(bos);
        }
        return "";
    }

}