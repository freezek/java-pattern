package com.ikaimen.log;

import com.alibaba.fastjson.JSON;
import com.ikaimen.log.type.ReportTypeEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Ylog
 * @Description 乂学日志对象
 * @Author chentao
 * @Date 2019/6/21 3:27 PM
 * @ModifyDate 2019/6/21 3:27 PM
 * @Version 1.0
 */
public class Ylog implements Serializable{


    public static final String INPUT_PARAM = "INPUT";
    public static final String OUTPUT_PARAM = "OUTPUT";
    public static final String EXCEPTION = "EXCEPTION";
    //用户主键
    private String userId;
    //路程id
    private String requestId;
    //报告类型
    private List<ReportTypeEnum> reportTypeEnum;
    //动作类型
    private String actionType;
    //入参
    private Map<String, Object> inParam;
    //出参
    private Map<String, Object> outParam;
    //业务描述
    private String desc;
    //时间戳
    private long timestamp;
    //耗时
    private long spendTime;
    //异常类
    private String eName;
    //异常栈信息
    private String eStackTrace;
    //标识
    private String marker;


    public static Ylog getYLog(String userRegId, String requestID,
                                          String actionType) {
        return new Ylog(userRegId, requestID, actionType);
    }

    public Ylog(String userRegId, String requestID, String actionType) {
        this.userId = userRegId;
        this.requestId = requestID;
        this.actionType = actionType;
    }

    public Map<String, Object> getInParam() {
        return inParam;
    }

    public Ylog setInParam(String key, Object value) {
        if (this.inParam == null) {
            this.inParam = new HashMap<>();
        }
        this.inParam.put(key, value);
        return this;
    }

    public Map<String, Object> getOutParam() {
        return outParam;
    }

    public Ylog setOutParam(String key, Object value) {
        if (this.outParam == null) {
            this.outParam = new HashMap<>();
        }
        this.outParam.put(key, value);
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Ylog setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public Ylog setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getReportTypeStr() {
        if (this.reportTypeEnum == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.reportTypeEnum.size(); i++) {
            sb.append(reportTypeEnum.get(i).getDesc());
            if (this.reportTypeEnum.size() > 0 && i != this.reportTypeEnum.size() - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    public String getRequestID() {
        return requestId;
    }

    public void setRequestID(String requestID) {
        this.requestId = requestID;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Ylog setReportTypeEnum(ReportTypeEnum reportTypeEnum) {
        if (this.reportTypeEnum == null) {
            this.reportTypeEnum = new ArrayList<ReportTypeEnum>();
        }
        this.reportTypeEnum.add(reportTypeEnum);
        return this;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Ylog setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setInParam(Map<String, Object> inParam) {
        this.inParam = inParam;
    }

    public void setOutParam(Map<String, Object> outParam) {
        this.outParam = outParam;
    }

    public long getSpendTime() {
        return spendTime;
    }

    public Ylog setSpendTime(long spendTime) {
        this.spendTime = spendTime;
        return this;
    }

    public String geteName() {
        return eName;
    }

    public Ylog seteName(String eName) {
        this.eName = eName;

        return this;
    }

    public String geteStackTrace() {
        return eStackTrace;
    }

    public Ylog seteStackTrace(String eStackTrace) {
        this.eStackTrace = eStackTrace;
        return this;
    }

    @Override
    public String toString() {

        return JSON.toJSONString(this);

    }
}
