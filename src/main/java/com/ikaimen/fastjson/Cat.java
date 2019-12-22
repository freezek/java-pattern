package com.ikaimen.fastjson;

import com.sun.istack.internal.NotNull;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author chentao
 * @Date 2019/7/4 3:51 PM
 * @ModifyDate 2019/7/4 3:51 PM
 * @Version 1.0
 */
public class Cat {

    static {
        System.out.println("猫的统称");
    }

    {
        System.out.println("cat");
    }

    public void voice(@NotNull String content){

        System.out.println("猫叫" + content);
    }

}
