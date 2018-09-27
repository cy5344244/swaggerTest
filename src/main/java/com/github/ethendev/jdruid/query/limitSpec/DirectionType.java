package com.github.ethendev.jdruid.query.limitSpec;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author: Ethan
 * @Date: 2018/9/27
 */
public enum DirectionType {
    ASCENDING("ascending"),
    DESCENDING("descending");

    private String value;

    DirectionType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
