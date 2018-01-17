package com.github.ethendev.jdruid.filter;

import lombok.Getter;

/**
 * logical expression filter type
 * @author: chy
 * @Date: 2018/9/15
 */
@Getter
public enum LogicalType {
    AND("and"),
    NOT("not"),
    OR("or");

    private String value;

    LogicalType(String value) {
        this.value = value;
    }
}
