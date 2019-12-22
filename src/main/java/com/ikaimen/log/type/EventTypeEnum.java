package com.ikaimen.log.type;

/**
 * 事件类型的分类
 */
public enum EventTypeEnum {
  PRINT_IN_PARAM("打印入参","PRINT_IN_PARAM"),
  TRIGGER_CLOSE_MASTER_TARGET_RULE("触发关闭已掌握知识点规则", "TRIGGER_CLOSE_MASTER_TARGET_RULE"),
  REQEST_PARAM_CHECK("请求参数检查", "REQEST_PARAM_CHECK"),
  GET_CACHESESSION_ID("获取缓存ID", "GET_CACHESESSION_ID"),
  UPDATE_SESSION_STATUS("更新缓存状态", "UPDATE_SESSION_STATUS"),
  UPDATE_CURRENT_ACTIVITY_STATUS("更新当前activity为已学过状态","UPDATE_CURRENT_ACTIVITY_STATUS"),
  RETURN_BEFORE_ACTIVITY("动作未完成返回上一个动作","RETURN_BEFORE_ACTIVITY"),
  //通用事件
  UPDATE_CACHESESSION("更新缓存状态", "UPDATE_CACHESESSION"),
  //kafka事件
  SAVE_MONGO_SECTION("存储mongosection", "SAVE_MONGO_SECTION"),
  //-------------------------------------------推题
  GET_CACHESESSION("获取缓存信息", "GET_CACHESESSION"),
  PARAM_INIT("参数初始化", "PARAM_INIT"),
  TRIGGER_SEC_PRE_ENTRY_RULE("触发SEC_PRE_ENTRY阶段规则", "TRIGGER_SEC_PRE_ENTRY_RULE"),
  TRIGGER_SEC_EXIT_RULE("触发SEC_EXIT阶段规则", "TRIGGER_SEC_EXIT_RULE"),
  TRIGGER_RECOMMEND_ITEM_RESOURCES_RULE("触发推题资源规则", "TRIGGER_RECOMMEND_ITEM_RESOURCES_RULE"),
  RECOMMEND_NEXT_ACT("获取下一个动作", "RECOMMEND_NEXT_ACT"),

  RECOMMEND_NEXT_ITEMS("获取该知识点相关的题资源", "RECOMMEND_NEXT_ITEMS"),
  RECOMMEND_NEXT_ITEM("获取下一题", "RECOMMEND_NEXT_ITEM"),
  DEAL_NEXT_LO_ERROR("没有可推荐知识点异常处理", "DEAL_NEXT_LO_ERROR"),
  DEAL_NEXT_ITEM_ERROR("没有可推荐资源异常处理", "DEAL_NEXT_ITEM_ERROR"),
  //----------------------------updateSession 接口事件

  UPDATE_GLOBAL_SESSION("更新全局缓存状态", "UPDATE_GLOBAL_SESSION"),
  UPDATE_PARENT_CACHESESSION("更新父类缓存状态", "UPDATE_PARENT_CACHESESSION"),
  TRIGGER_UPDATE_SESSION_RULE("触发更新缓存规则", "TRIGGER_UPDATE_SESSION_RULE"),

  GET_REPORT_METRIC("获取指标页指标","GET_REPORT_METRIC"),
  ;


  private String desc;
  private String code;

  EventTypeEnum(String desc, String code) {
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
