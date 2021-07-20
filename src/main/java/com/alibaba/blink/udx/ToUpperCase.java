package com.alibaba.blink.udx;

import org.apache.flink.table.functions.ScalarFunction;

/**
 * Created by 49744 on 2021/7/16 14:56
 */
public class ToUpperCase extends ScalarFunction {

    public String eval(String input){
        return input.toUpperCase();
    }

}
