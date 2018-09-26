package com.github.ethendev.jdruid.query;

import lombok.NonNull;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
public class Interval {
    private static final String DELIMITER = "/";

    private Interval () {
    }

    /**
     * return an interval that defines the time ranges to run the query over.
     * @param startTime ISO-8601 formatter
     * @param endTime ISO-8601 formatter
     * @return
     */
    public static String getInterval(String startTime, String endTime) {
        StringJoiner sj = new StringJoiner(DELIMITER);
        sj.add(startTime);
        sj.add(endTime);
        return sj.toString();
    }

    /**
     * return an interval in UTC, such as '2018-01-15T16:00:00Z/2018-01-15T16:05:00Z'.
     * @param startTime
     * @param endTime
     * @return interval
     */
    public static String getInterval(@NonNull ZonedDateTime startTime, @NonNull ZonedDateTime endTime) {
        DateTimeFormatter df = DateTimeFormatter.ISO_INSTANT;
        StringJoiner joiner = new StringJoiner(DELIMITER);
        joiner.add(df.format(startTime));
        joiner.add(df.format(endTime));
        return joiner.toString();
    }
}
