package com.ikaimen.log.type;

public enum PathTypeEnum {
  GET_SESSION_ID("获取会话对象ID", "GET_SESSION_ID"),
  RECOMMEND_NEXT_ACTIVITY("推送下个动作", "RECOMMEND_NEXT_ACTIVITY"),
  UPDATE_SESSION_STATUS("更新缓存状态", "UPDATE_SESSION_STATUS"),
  GET_REPORT_METRIC("获取缓存报告","GET_REPORT_METRIC"),
  ;
  private String desc;
  private String code;

  PathTypeEnum(String desc, String code) {
    this.desc = desc;
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDesc() {
    return desc;
  }

  private void setDesc(String desc) {
    this.desc = desc;
  }
}
