package com.tomek.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateTimeChecker {
    private Pattern datePattern = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
    private Pattern timePattern = Pattern.compile("\\d{1,2}:\\d{1,2}");

    boolean hasDate(String text) {
        Matcher dateMatcher = datePattern.matcher(text);
        return dateMatcher.find();
    }

    boolean hasTime(String text) {
        Matcher timeMatcher = timePattern.matcher(text);
        return timeMatcher.find();
    }

    String getDate(String text) {
        Matcher dateMatcher = timePattern.matcher(text);
        if (dateMatcher.find()) {
            return dateMatcher.group();
        } else return null;
    }

    String getTime(String text) {
        return null;
    }
}
