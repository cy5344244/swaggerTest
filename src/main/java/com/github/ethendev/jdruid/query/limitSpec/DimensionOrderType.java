package com.github.ethendev.jdruid.query.limitSpec;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author: Ethan
 * @Date: 2018/9/27
 */
public enum DimensionOrderType {
    ALPHANUMERIC("alphanumeric"),
    LEXICOGRAPHIC("lexicographic"),
    NUMERIC("numeric"),
    STRLEN("strlen");

    private String value;

    DimensionOrderType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
