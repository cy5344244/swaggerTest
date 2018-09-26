package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class CardinalityAggregator extends BaseAggregator {
    private List<String> fieldNames;
    private Boolean byRow;

    public CardinalityAggregator(@NonNull String name, @NonNull List<String> fieldNames) {
        super(AggregatorType.CARDINALITY.getValue(), name);
        this.fieldNames = fieldNames;
    }

    public CardinalityAggregator(@NonNull String name, @NonNull List<String> fieldNames, Boolean byRow) {
        super(AggregatorType.CARDINALITY.getValue(), name);
        this.fieldNames = fieldNames;
        this.byRow = byRow;
    }
}
