import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void getLastDayOfMonth() {
        int month = 5;
        int expected = 31;

        int result = NextDayCalculator.getLastDayOfMonth(month);
        assertEquals(expected,result);
    }

    @Test
    void getDay() {
        int month = 1;
        int day = 31;
        int expected = 1;

        int result = NextDayCalculator.getDay(day,month);
        assertEquals(expected, result);
    }

    @Test
    void getMonth() {
        int month = 12;
        int day = 1;
        int expected = 12;

        int result = NextDayCalculator.getMonth(day, month);
        assertEquals(expected, result);
    }

    @Test
    void getYear() {
        int day = 31;
        int month = 12;
        int year = 2020;
        int expected = 2021;

        int result = NextDayCalculator.getYear(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void getDayMonthYear() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int[] expected = {1,1,2019};

        int[] result = NextDayCalculator.getDayMonthYear(day,month,year);
        for (int x:result){
            System.out.println(x);
        }
        assertArrayEquals(expected,result);

    }
}