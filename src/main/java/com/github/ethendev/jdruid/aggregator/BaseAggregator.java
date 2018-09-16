package com.github.ethendev.jdruid.aggregator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseAggregator {
    private String type;
    private String name;
}
