package com.github.ethendev.jdruid.query;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
public enum GranularityType {
    ALL("all"),
    NONE("none"),
    SECOND("second"),
    MINUTE("minute"),
    FIFTEEN_MINUTE("fifteen_minute"),
    THIRTY_MINUTE("thirty_minute"),
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    QUARTER("quarter"),
    YEAR("year");

    private String value;

    GranularityType(String value) {
        this.value = value;
    }

    @JsonGetter
    public String getValue() {
        return value;
    }
}
