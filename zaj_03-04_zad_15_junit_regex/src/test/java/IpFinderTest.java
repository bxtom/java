import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IpFinderTest {
    String[] testStrings = new String[4];

    @Before
    public void setUp() throws Exception {
        testStrings[0] = "Serwer gry dostępny jest pod adresem 10.234.20.90 - miłej zabawy!";
        testStrings[1] = "Adres domeny mojafirma.com to 23.340.45.900";
        testStrings[2] = "Współrzędne to 90.3454 stopnie na północ";
        testStrings[3] = "Tu nie ma nawet żadnych cyfr!";
    }

    @Test
    public void hasIp() throws Exception {
        assertTrue(new IpFinder(testStrings[0]).hasIp());
        assertTrue(new IpFinder(testStrings[1]).hasIp());
        assertFalse(new IpFinder(testStrings[2]).hasIp());
        assertFalse(new IpFinder(testStrings[3]).hasIp());
    }

    @Test
    public void getIp() throws Exception {
        assertEquals(new IpFinder(testStrings[0]).getIp(), "10.234.20.90");
        assertEquals(new IpFinder(testStrings[1]).getIp(), "23.340.45.900");
        assertNull(new IpFinder(testStrings[2]).getIp());
        assertNull(new IpFinder(testStrings[3]).getIp());
    }
}