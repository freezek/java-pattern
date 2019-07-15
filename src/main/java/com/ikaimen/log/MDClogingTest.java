package com.ikaimen.log;

import com.alibaba.fastjson.JSON;
import com.ikaimen.log.type.EventActionTypeEnum;
import org.slf4j.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName MDClogingTest
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/17 11:36 AM
 * @ModifyDate 2019/6/17 11:36 AM
 * @Version 1.0
 */
public class MDClogingTest {

    private static String str = "模拟空指针异常！";

    private static String abc = "def";

    public static final Logger logger = LoggerFactory.getLogger(MDClogingTest.class);

    public static void main(String[] args) {


        try {
            long start = System.currentTimeMillis();
            MDC.put("userId","userId");
            MDC.put("traceId","traceId");
//            System.out.println(3/2);
//            System.out.println(System.currentTimeMillis()-start);
////            logger.info(logger.getName());
////
////            LoggerUtil.createFunTime(logger);
////            if(logger.isDebugEnabled()){
////                logger.info("input args:{}",9%2);
////
//            nullPointerTest(str);
////            System.out.println("after exception ！");
//            Map map = new HashMap<>();
//            map.put("a",123);
            for(int i=0;i<10000;i++){
                JSON.parse("{\n" +
                        "\t\"actionType\": \"action\",\n" +
                        "\t\"desc\": \"desc\",\n" +
                        "\t\"eName\": \"class com.alibaba.fastjson.JSONException\",\n" +
                        "\t\"eStackTrace\": \"[{\\\"className\\\":\\\"com.alibaba.fastjson.parser.DefaultJSONParser\\\",\\\"fileName\\\":\\\"DefaultJSONParser.java\\\",\\\"lineNumber\\\":292,\\\"methodName\\\":\\\"parseObject\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.alibaba.fastjson.parser.DefaultJSONParser\\\",\\\"fileName\\\":\\\"DefaultJSONParser.java\\\",\\\"lineNumber\\\":517,\\\"methodName\\\":\\\"parseObject\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.alibaba.fastjson.parser.DefaultJSONParser\\\",\\\"fileName\\\":\\\"DefaultJSONParser.java\\\",\\\"lineNumber\\\":517,\\\"methodName\\\":\\\"parseObject\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.alibaba.fastjson.parser.DefaultJSONParser\\\",\\\"fileName\\\":\\\"DefaultJSONParser.java\\\",\\\"lineNumber\\\":1157,\\\"methodName\\\":\\\"parseArray\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.alibaba.fastjson.parser.DefaultJSONParser\\\",\\\"fileName\\\":\\\"DefaultJSONParser.java\\\",\\\"lineNumber\\\":476,\\\"methodName\\\":\\\"parseObject\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.alibaba.fastjson.parser.DefaultJSONParser\\\",\\\"fileName\\\":\\\"DefaultJSONParser.java\\\",\\\"lineNumber\\\":1327,\\\"methodName\\\":\\\"parse\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.alibaba.fastjson.parser.DefaultJSONParser\\\",\\\"fileName\\\":\\\"DefaultJSONParser.java\\\",\\\"lineNumber\\\":1293,\\\"methodName\\\":\\\"parse\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.alibaba.fastjson.JSON\\\",\\\"fileName\\\":\\\"JSON.java\\\",\\\"lineNumber\\\":137,\\\"methodName\\\":\\\"parse\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.alibaba.fastjson.JSON\\\",\\\"fileName\\\":\\\"JSON.java\\\",\\\"lineNumber\\\":128,\\\"methodName\\\":\\\"parse\\\",\\\"nativeMethod\\\":false},{\\\"className\\\":\\\"com.ikaimen.log.MDClogingTest\\\",\\\"fileName\\\":\\\"MDClogingTest.java\\\",\\\"lineNumber\\\":48,\\\"methodName\\\":\\\"main\\\",\\\"nativeMethod\\\":false}]\",\n" +
                        "\t\"inParam\": {\n" +
                        "\t\t\"input\": \"模拟空指针异常！\"\n" +
                        "\t},\n" +
                        "\t\"marker\": \"YLOG-ERROR\",\n" +
                        "\t\"outParam\": {\n" +
                        "\t\t\"outPut\": \"模拟空指针异常！\"\n" +
                        "\t},\n" +
                        "\t\"reportTypeStr\": \"null\",\n" +
                        "\t\"spendTime\": 0,\n" +
                        "\t\"timestamp\": 1561518587632 \n" +
                        "}");
            }
           // LoggerUtil.createFuncTime(logger,start, EventActionTypeEnum.CAL_CONDITION_METRIC.getDesc(),"--",null,str);
            System.out.println(logger.isDebugEnabled());
            if(logger.isDebugEnabled()){
                System.out.println("=======");
                LoggerUtil.createDebug(logger, EventActionTypeEnum.CAL_CONDITION_METRIC.getDesc(),str,null,str);
            }
            LoggerUtil.createEvent(logger, EventActionTypeEnum.CAL_CONDITION_METRIC.getDesc(),str,null,str);
            LoggerUtil.createInfo(logger, EventActionTypeEnum.CAL_CONDITION_METRIC.getDesc(),str,null,str);
            LoggerUtil.createState(logger, EventActionTypeEnum.CAL_CONDITION_METRIC.getDesc(),str,null,str);
            LoggerUtil.createError(logger,new NullPointerException(), EventActionTypeEnum.CAL_CONDITION_METRIC.getCode(),JSON.toJSONString(args),null,null);

        } catch (Exception e) {

           LoggerUtil.createError(logger,e,"action",str,str,"desc");
        }

        System.out.println('['^'['^']'^']');
    }

    public static void nullPointerTest(String nullPointer) throws IOException {

       // System.out.println(9/0);

       for(int i=0;i<=1000;i++){
            System.out.println(String.format("KKK%d",i));
            if(i==5){
               // throw  new NullPointerException("");
                return;
            }
        }
    }

}
