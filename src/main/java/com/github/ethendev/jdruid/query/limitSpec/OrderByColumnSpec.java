package com.github.ethendev.jdruid.query.limitSpec;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Data
public class OrderByColumnSpec extends LimitSpec {
    private String dimension;
    private DirectionType direction;
    private DimensionOrderType dimensionOrder;

    public OrderByColumnSpec(@NonNull String dimension, @NonNull DirectionType direction) {
        this.dimension = dimension;
        this.direction = direction;
        this.dimensionOrder = DimensionOrderType.LEXICOGRAPHIC;
    }

    public OrderByColumnSpec(@NonNull String dimension, @NonNull DirectionType direction,
                             @NonNull DimensionOrderType dimensionOrder) {
        this.dimension = dimension;
        this.direction = direction;
        this.dimensionOrder = dimensionOrder;
    }

}
