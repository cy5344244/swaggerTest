package com.github.ethendev.jdruid.query.limitSpec;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DefaultLimitSpec extends LimitSpec {
    private String dimension;
    private Integer limit;
    private List<OrderByColumnSpec> columns;
}
