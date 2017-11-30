package com.ljh.model;

import org.springframework.stereotype.Component;

/**
 * Created by ljh on 2017/11/24.
 */
@Component
public class Sequence {
    /*序列名*/
    private String seqName;
    /*当前值*/
    private Integer currentValue;
    /*自增值*/
    private Integer increment;

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public Integer getIncrement() {
        return increment;
    }

    public void setIncrement(Integer increment) {
        this.increment = increment;
    }
}
