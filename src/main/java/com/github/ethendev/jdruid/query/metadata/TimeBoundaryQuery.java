package com.github.ethendev.jdruid.query.metadata;

import com.github.ethendev.jdruid.filter.BaseFilter;
import com.github.ethendev.jdruid.query.Context;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Getter
public class TimeBoundaryQuery {
    private static final String QUERY_TYPE = "timeBoundary";

    private String queryType;
    private String dataSource;

    /**
     * set to maxTime or minTime to return only the latest or earliest timestamp.
     * Default to returning both if not set
     */
    private BoundType bound;
    private BaseFilter filter;
    private Context context;

    public TimeBoundaryQuery(@NonNull String dataSource, BoundType bound, BaseFilter filter, Context context) {
        this.queryType = QUERY_TYPE;
        this.dataSource = dataSource;
        this.bound = bound;
        this.filter = filter;
        this.context = context;
    }

}
