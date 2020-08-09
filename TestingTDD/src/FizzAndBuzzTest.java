import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzAndBuzzTest {

    @Test
    void fizzAndBuzz() {
        int number = 40;
        String expected = "bon muoi";

        String result = FizzAndBuzz.getFizzAndBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    void getNumberContain3() {
        int number = 40;
        String expected = "bon muoi";

        String result = FizzAndBuzz.getNumberContain3(number);
        assertEquals(expected,result);
    }
}