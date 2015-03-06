package com.epam.tb.blog.model.factory;

import java.util.Date;

public class Dates {
    public static Date randomDateBetween(Date start, Date end) {
        long delta = (long) (Math.random() * (end.getTime() - start.getTime()));
        return new Date(start.getTime() + delta);
    }

    public static Date randomDateFrom(Date start) {
        return randomDateBetween(start, new Date());
    }
}
