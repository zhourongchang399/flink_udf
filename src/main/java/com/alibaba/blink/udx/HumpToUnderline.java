package com.alibaba.blink.udx;

import org.apache.flink.table.functions.ScalarFunction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 49744 on 2021/7/16 15:00
 */
public class HumpToUnderline extends ScalarFunction{

    public String eval(String input){
        Pattern pattern = Pattern.compile("\\B(\\p{Upper})(\\p{Lower}*)");
        Matcher matcher = pattern.matcher(input);
        String replaceAll = matcher.replaceAll("_$1$2");
        String output = replaceAll.toLowerCase();
        return output;
    }

}
