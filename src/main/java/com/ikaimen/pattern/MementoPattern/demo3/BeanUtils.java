package com.ikaimen.pattern.MementoPattern.demo3;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @Author: Mr.Chen
 *
 * @Description: BeanUtils 工具类
 *
 * @Date: Created in 2017/9/10 下午4:57
 **/
public class BeanUtils {

    //把bean的所有属性及数值放入到HashMap中

    public static HashMap<String,Object> backupProp(Object object){

        HashMap<String,Object> result = new HashMap<String, Object>();

        try{

            //获得Bean描述
            BeanInfo  beanInfo = Introspector.getBeanInfo(object.getClass());

            //获得属性描述

            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            //遍历所有的属性

            for(PropertyDescriptor des:descriptors){

                //属性名称

                String filedName = des.getName();

                //读取属性的方法

                Method  getter = des.getReadMethod();

                //读取属性值

                Object fieldValue = getter.invoke(object,new Object[]{});

                if(!filedName.equalsIgnoreCase("class")){

                    result.put(filedName,fieldValue);
                }

            }

        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return result;
    }


    //把hashMap 的值返回到bean中

    public static void restoreProp(Object bean ,HashMap<String,Object> propMap){

        try {

            //获得bean描述

            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());

            //获得属性描述

            PropertyDescriptor[] descriptors =beanInfo.getPropertyDescriptors();

            //遍历所有属性

            for (PropertyDescriptor des:descriptors){

                //属性名称

                String fieldName = des.getName();

                //如果有这个属性

                if(propMap.containsKey(fieldName)){

                    //写属性的方法

                    Method setter = des.getWriteMethod();

                    setter.invoke(bean,new Object[]{propMap.get(fieldName)});

                }

            }


        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
