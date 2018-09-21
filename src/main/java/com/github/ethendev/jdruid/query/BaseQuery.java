package com.github.ethendev.jdruid.query;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Getter
@NoArgsConstructor
public abstract class BaseQuery {
    private String queryType;
    private String dataSource;
    /**
     * ISO-8601 Intervals. It defines the time ranges to run the query over.
     */
    private List<String> intervals;
    private GranularityType granularity;

    public BaseQuery(@NonNull String queryType, @NonNull String dataSource, @NonNull List<String> intervals,
                     @NonNull GranularityType granularity) {
        this.queryType = queryType;
        this.dataSource = dataSource;
        this.intervals = intervals;
        this.granularity = granularity;
    }
}
