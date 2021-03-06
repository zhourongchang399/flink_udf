package com.alibaba.blink.udx;



import org.apache.flink.table.functions.FunctionContext;
import org.apache.flink.table.functions.ScalarFunction;

public class StringLengthUdf extends ScalarFunction {
    // 可选， open方法可以不写,若写的话需要import org.apache.flink.table.functions.FunctionContext;
    @Override
    public void open(FunctionContext context) {
    }
    public int eval(String a) {
        return a == null ? 0 : a.length();
    }
    public int eval(String b, String c) {
        return eval(b) + eval(c);
    }
    //可选，close方法可以不写
    @Override
    public void close() {
    }
}