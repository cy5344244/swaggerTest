package com.github.ethendev.jdruid.postAggregator;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author: Ethan
 * @Date: 2018/9/21
 */
public enum ArithmeticOrdering {
    NULL("null"),
    NUMERIC_FIRST("numericFirst");

    private String value;

    ArithmeticOrdering(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }
}
