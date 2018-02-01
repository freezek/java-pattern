package com.ikaimen.net.util;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Mr.Chen
 * @description 数学表达式计算工具类
 * @create 2018-02-01 15:59
 **/
public class Calculator {

    private final static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
    public static Object cal(String expression) throws ScriptException {
        return jse.eval(expression);
    }
}
