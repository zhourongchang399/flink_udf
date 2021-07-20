package com.alibaba.blink.udx;

import org.apache.flink.table.functions.ScalarFunction;

/**
 * Created by 49744 on 2021/7/19 17:50
 */
public class IntToLong extends ScalarFunction {

    public long eval(int input){
        long output = Long.valueOf(String.valueOf(input));
        return output;
    }

}
