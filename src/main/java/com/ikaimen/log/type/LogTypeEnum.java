package com.ikaimen.log.type;

/**
 * @ClassName LogType
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/25 10:50 AM
 * @ModifyDate 2019/6/25 10:50 AM
 * @Version 1.0
 */
public enum LogTypeEnum {

    INFO("INFO日志", "YLOG-INFO"),
    ERROR("ERROR日志", "YLOG-ERROR"),
    STATE("STATE日志", "YLOG-STATE"),
    DEBUG("DEBUG日志","YLOG-DEBUG"),
    TRACE("TRACE跟踪日志","YLOG-TRACE"),
    EVENT("EVENT事件日志","YLOG-EVENT"),
    FUNCTIME("性能日志","YLOG-FUNCTIME"),
    ;
    private String desc;
    private String code;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    LogTypeEnum(String desc, String code) {
        this.desc = desc;
        this.code = code;
    }
}
