package com.ikaimen.log;

/**
 * @ClassName ILogFunc
 * @Description 日志操作接口
 * @Author chentao
 * @Date 2019/6/24 2:07 PM
 * @ModifyDate 2019/6/24 2:07 PM
 * @Version 1.0
 */
public interface ILogFunc {

    /**
     * @Description 打印info日志
     * @Author Norman
     * @Date 2019/6/24 2:15 PM
     * @ModifyDate 2019/6/24 2:15 PM
     * @Param [input, output, desc]
     * @Return void
     * @Version 1
     */
    void createInfo(String input, String output, String desc);

    /**
     * @Description 创建状态日志
     * @Author Norman
     * @Date 2019/6/24 2:16 PM
     * @ModifyDate 2019/6/24 2:16 PM
     * @Param [input, output, desc]
     * @Return void
     * @Version 1
     */
    void createState(String input, String output, String desc);

    /**
     * @Description 创建错误日志
     * @Author Norman
     * @Date 2019/6/24 2:17 PM
     * @ModifyDate 2019/6/24 2:17 PM
     * @Param [input, output, desc]
     * @Return void
     * @Version 1
     */
    void createError(String input, String output, String desc);

    /**
     * @Description 创建事件日志
     * @Author Norman
     * @Date 2019/6/24 2:17 PM
     * @ModifyDate 2019/6/24 2:17 PM
     * @Param [input, output, desc]
     * @Return void
     * @Version 1
     */
    void createEvent(String input, String output, String desc);

    /**
     * @Description 创建调试日志
     * @Author Norman
     * @Date 2019/6/24 2:17 PM
     * @ModifyDate 2019/6/24 2:17 PM
     * @Param [input, output, desc]
     * @Return void
     * @Version 1
     */
    void createDebug(String input, String output, String desc);

    /**
     * @Description 创建代码执行时间日志
     * @Author Norman
     * @Date 2019/6/24 2:19 PM
     * @ModifyDate 2019/6/24 2:19 PM
     * @Param [start, input, output, desc]
     * @Return void
     * @Version 1
     */
    void createFuncTime(long start, String input, String output, String desc);

}
