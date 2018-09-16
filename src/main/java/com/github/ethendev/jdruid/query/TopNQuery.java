package com.github.ethendev.jdruid.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.ethendev.jdruid.aggregator.BaseAggregator;
import com.github.ethendev.jdruid.filter.BaseFilter;
import com.github.ethendev.jdruid.postAggregator.BasePostAggregator;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopNQuery extends BaseQuery {
    private BaseFilter filter;
    private List<BaseAggregator> aggregators;
    private List<BasePostAggregator> postAggregations;
    private String dimension;
    private Integer threshold;
    // TODO change type
    private Object metric;
    private Context context;

    @Builder
    public TopNQuery(String queryType, String dataSource, List<String> intervals, GranularityType granularity,
                     BaseFilter filter, List<BaseAggregator> aggregators, List<BasePostAggregator> postAggregations,
                     @NonNull String dimension, @NonNull Integer threshold, @NonNull Object metric, Context context) {
        super(queryType, dataSource, intervals, granularity);
        this.filter = filter;
        this.aggregators = aggregators;
        this.postAggregations = postAggregations;
        this.dimension = dimension;
        this.threshold = threshold;
        this.metric = metric;
        this.context = context;
    }
}
