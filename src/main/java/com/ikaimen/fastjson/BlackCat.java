package com.ikaimen.fastjson;

import org.springframework.lang.NonNull;

/**
 * @ClassName BlackCat
 * @Description TODO
 * @Author chentao
 * @Date 2019/7/4 3:53 PM
 * @ModifyDate 2019/7/4 3:53 PM
 * @Version 1.0
 */
public class BlackCat extends Cat{


    static {
        System.out.println("白猫");
    }
    {
        System.out.println("白");
    }
    /**
    *@Description TODO
    *@Author Norman
    *@Date 2019/7/12 11:35 AM
    *@ModifyDate 2019/7/12 11:35 AM
    *@Param [content]
    *@Return void
    *@Version 1
    */

    public void paly(@NonNull String content){
        super.voice(content);
        System.out.println("白猫玩"+ content);
    }

    public static void main(String[] args) {

        BlackCat blackCat = new BlackCat();
        blackCat.paly("..");

    }
}
