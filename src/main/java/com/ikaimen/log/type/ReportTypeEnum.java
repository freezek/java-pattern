package com.ikaimen.log.type;

public enum ReportTypeEnum {
  RECOM_ITEM_REPORT("推知识点推题报告", "RECOM_ITEM_REPORT"),
  RECOM_ITEM_REPORT_SIMPLE("推知识点推题报告", "RECOM_ITEM_REPORT_SIMPLE_REPORT"),
  EXCEPTION_REPORT("异常报警", "EXCEPTION_REPORT"),
  UPDATE_SESSION("缓存更新报告","UPDATE_SESSION_REPORT"),
  RULE_REPORT("规则触发报告", "RULE_REPORT"),
  NEXT_ACT_REPORT("动作结果报告", "NEXT_ACT_REPORT"),
  PARAM_REPORT("入参出参报告","PARAM_REPORT"),
  FORGET_REPORT("计算记忆曲线报告","FORGET_REPORT"),
  CHECKRULE_REPORT("获取rule报告","CHECKRULE_REPORT"),
  GOALFILTER_REPORT("goalfilter获取资源报告","GOALFILTER_REPORT"),
  KAFKA_LOGGER_REPORT("KAFKA消息生成消费报告","KAFKA_LOGGER_REPORT"),
  ;
  private String desc;
  private String code;

  ReportTypeEnum(String desc, String code) {
    this.code = code;
    this.desc = desc;
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
