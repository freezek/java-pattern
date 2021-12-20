package com.ikaimen.mapstruct;

import org.mapstruct.factory.Mappers;

/**
 * @ClassName TestMapStruct
 * @Description
 * @Author Mr.Chen
 * @Date 2021/6/3 上午10:52
 * @Version V1.0
 **/
public interface TestMapStruct {
    TestMapStruct INSTANCE = Mappers.getMapper(TestMapStruct.class);

    Human toConvert(People people);
}
