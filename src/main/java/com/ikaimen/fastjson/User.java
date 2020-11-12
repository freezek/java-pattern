package com.ikaimen.fastjson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author chentao
 * @Date 2019/6/28 7:54 PM
 * @ModifyDate 2019/6/28 7:54 PM
 * @Version 1.0
 */
@JsonIgnoreProperties
public class User  implements Serializable{

    private String name;

    @Deprecated
    private String sex;

    private int age;

    private Class aClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", aClass=" + aClass +
                '}';
    }

}
