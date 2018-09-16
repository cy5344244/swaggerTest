package com.github.ethendev.jdruid.query.limitSpec;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderByColumnSpec extends LimitSpec {
    private String dimension;
    /**
     * "ascending"|"descending"
     */
    private String direction;
    /**
     * "lexicographic"(default)|"alphanumeric"|"strlen"|"numeric"
     */
    private String dimensionOrder;
}
