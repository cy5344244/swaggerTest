package com.github.ethendev.jdruid;

import com.github.ethendev.jdruid.query.Interval;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
public class IntervalTest {

    @Test
    public void getInterval1() {
        String startTime = "2018-01-16T00:00:00+08:00";
        String endTime = "2018-01-16T00:05:00+08:00";
        String interval = Interval.getInterval(ZonedDateTime.parse(startTime), ZonedDateTime.parse(endTime));
        assertEquals("2018-01-15T16:00:00Z/2018-01-15T16:05:00Z", interval);
    }

}