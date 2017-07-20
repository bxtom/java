package com.tomek.regex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTimeCheckerTest {
    private DateTimeChecker dateTimeChecker;

    @Before
    public void setUp() throws Exception {
        dateTimeChecker = new DateTimeChecker();
    }

    @Test
    public void hasdate() throws Exception {
        String testDate = "Dzis jest 09/07/2017, jest cieplo";
        assertTrue(dateTimeChecker.hasDate(testDate));
        String testDate2 = "Ten tekst nie zawiera daty";
        assertFalse(dateTimeChecker.hasDate(testDate2));
        String testDate3 = "Dzis jest 9/7/2017, jest cieplo";
        assertTrue(dateTimeChecker.hasDate(testDate3));
        String testDate4 = "Dzis jest 9/7/17, jest cieplo";
        assertTrue(dateTimeChecker.hasDate(testDate4));
        String testDate5 = "to nie jest data 12:40, jest cieplo";
        assertFalse(dateTimeChecker.hasDate(testDate5));
    }

    @Test
    public void hasTime() throws Exception {
        String testTime = "Jest godzina 12:40, jest cieplo";
        assertTrue(dateTimeChecker.hasTime(testTime));
        String testTime2 = "Tu nie ma godziny, jest cieplo";
        assertFalse(dateTimeChecker.hasTime(testTime2));
    }

    @Test
    public void getDate() throws Exception {
        String testDate1 = "Tu jest data 12/7/2013";
        assertEquals("12/7/2013", dateTimeChecker.getDate(testDate1));
        String testDate2 = "Tu nie ma daty";
        assertNull("12/7/2013", dateTimeChecker.getDate(testDate2));
    }

    @Test
    public void getTime() throws Exception {

    }
}