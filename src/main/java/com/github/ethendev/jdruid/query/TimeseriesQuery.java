package com.github.ethendev.jdruid.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.ethendev.jdruid.aggregator.BaseAggregator;
import com.github.ethendev.jdruid.filter.BaseFilter;
import com.github.ethendev.jdruid.postAggregator.BasePostAggregator;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeseriesQuery extends BaseQuery {
    private static final String QUERY_TYPE = "timeseries";
    private BaseFilter filter;
    private List<BaseAggregator> aggregators;
    private List<BasePostAggregator> postAggregations;
    private Boolean descending;
    private Context context;

    @Builder
    private TimeseriesQuery(String dataSource, List<String> intervals, GranularityType granularity,
                           BaseFilter filter, List<BaseAggregator> aggregators, List<BasePostAggregator> postAggregations, Boolean descending, Context context) {
        super(QUERY_TYPE, dataSource, intervals, granularity);
        this.filter = filter;
        this.aggregators = aggregators;
        this.postAggregations = postAggregations;
        this.descending = descending;
        this.context = context;
    }
}
