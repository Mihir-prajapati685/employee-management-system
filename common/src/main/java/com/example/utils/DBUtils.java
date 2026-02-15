package com.example.utils;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.where.condition.IsGreaterThan;
import org.mybatis.dynamic.sql.where.condition.IsLessThan;

import java.util.Date;

public class DBUtils {

    public static IsGreaterThan<Date> isDateInFuture() {
        return SqlBuilder.isGreaterThan(DateUtils.getNowInDate());
    }

    public static IsLessThan<Date> isDateInPast(){
        return SqlBuilder.isLessThan(DateUtils.getNowInDate());
    }
}
