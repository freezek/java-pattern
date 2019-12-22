package com.ikaimen.log;

import com.alibaba.fastjson.JSON;
import com.ikaimen.log.type.LogTypeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import sun.rmi.runtime.Log;


/**
 * @ClassName LoggerUtil
 * @Description 日志操作工具类
 * @Author chentao
 * @Date 2019/6/21 3:18 PM
 * @ModifyDate 2019/6/21 3:18 PM
 * @Version 1.0
 */
public class LoggerUtil {

    private static Logger logger = LoggerFactory.getLogger(LoggerUtil.class);


    /**
    *@Description 打印info日志
    *@Author Norman
    *@Date 2019/6/25 10:00 AM
    *@ModifyDate 2019/6/25 10:00 AM
    *@Param [logger, actionType, input, output, desc]
    *@Return void
    *@Version 1
    */
    public static void createInfo(Logger logger, String actionType, Object input, String output,String desc) {
        String ylog = Ylog.getYLog(MDC.get("userId"), MDC.get("traceId"), actionType)
                .setInParam("input", input)
                .setTimestamp(System.currentTimeMillis())
                .setDesc(desc)
                .setMarker(LogTypeEnum.INFO.getCode())
                .setOutParam("outPut", output)
                .toString();
        logger.info(ylog);

    }

    /**
    *@Description 创建状态日志
    *@Author Norman
    *@Date 2019/6/25 10:00 AM
    *@ModifyDate 2019/6/25 10:00 AM
    *@Param [logger, actionType, input, output, desc]
    *@Return void
    *@Version 1
    */
    public static void createState(Logger logger,String actionType, Object input, String output,String desc) {
        String ylog = Ylog.getYLog(MDC.get("userId"), MDC.get("traceId"), actionType)
                .setInParam("input", input)
                .setTimestamp(System.currentTimeMillis())
                .setDesc(desc)
                .setMarker(LogTypeEnum.STATE.getCode())
                .setOutParam("outPut", output)
                .toString();
        logger.info(ylog);
    }

    /**
    *@Description 创建错误日志
    *@Author Norman
    *@Date 2019/6/25 10:00 AM
    *@ModifyDate 2019/6/25 10:00 AM
    *@Param [logger, e, actionType, input, output, desc]
    *@Return void
    *@Version 1
    */
    public static void createError(Logger logger,Exception e , String actionType,Object input, String output,String desc) {
        String ylog = Ylog.getYLog(MDC.get("userId"), MDC.get("traceId"), actionType)
                .setInParam("input", input)
                .setTimestamp(System.currentTimeMillis())
                .setDesc(desc)
                .setMarker(LogTypeEnum.ERROR.getCode())
                .setOutParam("outPut", output)
                .seteName(e.getClass().toString())
                .seteStackTrace(JSON.toJSONString(e.getStackTrace()))
                .toString();
        logger.error(ylog);

    }

    /**
    *@Description 创建事件日志
    *@Author Norman
    *@Date 2019/6/25 10:01 AM
    *@ModifyDate 2019/6/25 10:01 AM
    *@Param [logger, actionType, input, output, desc]
    *@Return void
    *@Version 1
    */
    public static void createEvent(Logger logger,String actionType, Object input, String output,String desc) {
        String ylog = Ylog.getYLog(MDC.get("userId"), MDC.get("traceId"), actionType)
                .setInParam("input", input)
                .setTimestamp(System.currentTimeMillis())
                .setDesc(desc)
                .setMarker(LogTypeEnum.EVENT.getCode())
                .setOutParam("outPut", output)
                .toString();
        logger.info(ylog);
    }

    /**
    *@Description 创建事件日志
    *@Author Norman
    *@Date 2019/6/25 10:01 AM
    *@ModifyDate 2019/6/25 10:01 AM
    *@Param [logger, actionType, input, output, desc]
    *@Return void
    *@Version 1
    */
    public static void createDebug(Logger logger, String actionType, Object input, String output,String desc) {
        String ylog = Ylog.getYLog(MDC.get("userId"), MDC.get("traceId"), actionType)
                .setInParam("input", input)
                .setTimestamp(System.currentTimeMillis())
                .setDesc(desc)
                .setMarker(LogTypeEnum.DEBUG.getCode())
                .setOutParam("outPut", output)
                .toString();
        logger.debug(ylog);

    }

    /**
    *@Description 创建代码执行时间日志
    *@Author Norman
    *@Date 2019/6/25 10:01 AM
    *@ModifyDate 2019/6/25 10:01 AM
    *@Param [logger, start, actionType, input, output, desc]
    *@Return void
    *@Version 1
    */
    public static void createFuncTime(Logger logger, long start, String actionType, Object input, String output,String desc) {
        String ylog = Ylog.getYLog(MDC.get("userId"), MDC.get("traceId"), actionType)
                .setInParam("input", input)
                .setTimestamp(System.currentTimeMillis())
                .setDesc(desc)
                .setMarker(LogTypeEnum.FUNCTIME.getCode())
                .setOutParam("outPut", output)
                .setTimestamp(System.currentTimeMillis())
                .setSpendTime(System.currentTimeMillis()-start)
                .toString();
        logger.info(ylog);
    }


}
