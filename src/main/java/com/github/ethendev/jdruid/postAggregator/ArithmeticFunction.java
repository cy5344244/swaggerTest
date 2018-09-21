package com.github.ethendev.jdruid.postAggregator;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author: Ethan
 * @Date: 2018/9/21
 */
public enum ArithmeticFunction {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    QUOTIENT("quotient");

    private String value;

    ArithmeticFunction(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
