package com.github.ethendev.jdruid.aggregator;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
public enum AggregatorType {
    CARDINALITY("cardinality"),
    COUNT("count"),
    DOUBLE_MAX("doubleMax"),
    DOUBLE_MIN("doubleMin"),
    DOUBLE_SUM("doubleSum"),
    FILTERED("filtered"),
    HYPER_UNIQUE("hyperUnique"),
    JAVASCRIPT("javascript"),
    LONG_MAX("longMax"),
    LONG_MIN("longMin"),
    LONG_SUM("longSum");

    private String value;

    AggregatorType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
