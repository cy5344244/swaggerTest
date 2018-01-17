package com.github.ethendev.jdruid.filter;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author: chy
 * @Date: 2018/9/15
 */
public class LogicalTypeTest {

    @Test
    public void getValue() {
        Assert.assertEquals(LogicalType.valueOf("AND").getValue(), "and");
    }
}