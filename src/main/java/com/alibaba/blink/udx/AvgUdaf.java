package com.alibaba.blink.udx;

import org.apache.flink.table.functions.AggregateFunction;

/**
 * Created by 49744 on 2021/7/20 11:01
 */
public class AvgUdaf extends AggregateFunction<Integer,AvgUdaf.AvgAccum>{

    public static class AvgAccum {
        int total;
        int count;
    }

    @Override
    public AvgAccum createAccumulator() {
        AvgAccum avgAccum = new AvgAccum();
        avgAccum.total = 0;
        avgAccum.count = 0;
        return avgAccum;
    }

    @Override
    public Integer getValue(AvgAccum accumulator) {
        int result = accumulator.total/accumulator.count;
        return result;
    }

    public void accumulate(AvgAccum accumulator, int iValue){
        accumulator.total+=iValue;
        accumulator.count++;
    }

    public void merge(CountUdaf.CountAccum accumulator, Iterable<CountUdaf.CountAccum> its) {
        for (CountUdaf.CountAccum other : its) {
            accumulator.total += other.total;
        }
    }
}
