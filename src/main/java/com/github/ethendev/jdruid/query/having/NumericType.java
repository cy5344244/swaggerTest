package com.github.ethendev.jdruid.query.having;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author: Ethan
 * @Date: 2018/9/27
 */
public enum NumericType {
    EQUAL_TO("equalTo"),
    GREATER_THAN("greaterThan"),
    LESS_THAN("lessThan");

    private String value;

    NumericType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
