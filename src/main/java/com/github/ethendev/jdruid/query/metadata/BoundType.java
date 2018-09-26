package com.github.ethendev.jdruid.query.metadata;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author: Ethan
 * @Date: 2018/9/26
 */
public enum BoundType {
    MAX_TIME("maxTime"),
    MIN_TIME("minTime");

    private String value;

    BoundType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
