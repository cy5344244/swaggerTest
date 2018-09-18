package com.github.ethendev.jdruid.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.ethendev.jdruid.aggregator.BaseAggregator;
import com.github.ethendev.jdruid.filter.BaseFilter;
import com.github.ethendev.jdruid.postAggregator.BasePostAggregator;
import com.github.ethendev.jdruid.query.limitSpec.LimitSpec;
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
public class GroupByQuery extends BaseQuery {
    private static final String QUERY_TYPE = "groupBy";
    private List<String> dimensions;
    private LimitSpec limitSpec;
    // TODO change type
    private Object having;
    private BaseFilter filter;
    private List<BaseAggregator> aggregators;
    private List<BasePostAggregator> postAggregations;
    private Context context;

    @Builder
    public GroupByQuery(String dataSource, List<String> intervals, GranularityType granularity,
                        @NonNull List<String> dimensions, LimitSpec limitSpec, Object having, BaseFilter filter,
                        List<BaseAggregator> aggregators, List<BasePostAggregator> postAggregations, Context context) {
        super(QUERY_TYPE, dataSource, intervals, granularity);
        this.dimensions = dimensions;
        this.limitSpec = limitSpec;
        this.having = having;
        this.filter = filter;
        this.aggregators = aggregators;
        this.postAggregations = postAggregations;
        this.context = context;
    }
}
