package com.ikaimen.log;

import org.slf4j.MDC;

/**
 * @ClassName MDCUtils
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/18 3:02 PM
 * @ModifyDate 2019/6/18 3:02 PM
 * @Version 1.0
 */
public class MDCUtils {

    private static String abc = "abc";

    public static String get(String key) {
        return MDC.get(key);
    }

    /**
     * 如果MDC中不包含key，则返回defaultValue
     * @param key
     * @param defaultValue
     * @return
     */
    public static String get(String key,String defaultValue) {
        String value = MDC.get(key);
        return value == null ? defaultValue : value;
    }

    public static String getRequestId() {
        return MDC.get(MDCConstants.REQUEST_ID_MDC_KEY);
    }

    public static String getRequestSeq() {
        return MDC.get(MDCConstants.REQUEST_SEQ_MDC_KEY);
    }

    public static String getUri() {
        return MDC.get(MDCConstants.URI_MDC_KEY);
    }

    /**
     * 获取此请求进入MDCFilter的时间戳
     * @return
     */
    public static String getTimestampOfFilter() {
        return MDC.get(MDCConstants.TIMESTAMP);
    }

    /**
     * 获取当前server的本地IP
     * @return
     */
    public static String getLocalIp() {
        return MDC.get(MDCConstants.LOCAL_IP_MDC_KEY);
    }

    public static String nextRequestSeq() {
        return MDC.get(MDCConstants.NEXT_REQUEST_SEQ_MDC_KEY);
    }

    public static String getHeader(String header) {
        return MDC.get(MDCConstants.HEADER_KEY_PREFIX + header);
    }

    public static String getCookie(String name) {
        return MDC.get(MDCConstants.COOKIE_KEY_PREFIX + name);
    }

    public static String getParameter(String name) {
        return MDC.get(MDCConstants.PARAMETER_KEY_PREFIX + name);
    }

    //如果你手动设置了MDC的值，请你要么配置HttpRequestMDCFilter，要么就是自己在合适的地方执行clear()方法
    public static void put(String key,String value) {
        MDC.put(key,value);
    }

    public static void clear() {
        MDC.clear();
    }

    public static void remove(String key) {
        MDC.remove(key);
    }
}
