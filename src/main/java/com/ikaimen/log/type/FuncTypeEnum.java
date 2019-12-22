package com.ikaimen.log.type;

/**
 * @author IBM CHEN ZHI KAN
 * @create 2018/9/3
 */
public enum FuncTypeEnum {
  FUNC_METHOD("method","方法执行"),
  FUNC_CACHE("cache","redis操作"),
  FUNC_API("api","api访问"),
  FUNC_MYSQL("mysql","mysql操作"),
  FUNC_MONGO("mongo","mongo操作"),
  FUNC_MONGO_HBASE("mongo-hbase","mongo-hbase操作");

  String  code;
  String desc;

  FuncTypeEnum(String code, String desc) {
    this.code=code;
    this.desc=desc;
  }

  public String getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }
}
