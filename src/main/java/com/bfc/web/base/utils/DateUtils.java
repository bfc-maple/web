package com.bfc.web.base.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    public static String dateToString(Date date, String format) {
        if (date == null)
            return "";
        if (StringUtils.isBlank(format))
            format = YYYY_MM_DD_HH_MM_SS;
        DateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }

    public static Date stringToDate(String date, String format) throws ParseException {
        if (StringUtils.isBlank(date))
            return null;
        if (StringUtils.isBlank(format))
            format = YYYY_MM_DD_HH_MM_SS;
        DateFormat df = new SimpleDateFormat(format);
        return df.parse(date);
    }
}
