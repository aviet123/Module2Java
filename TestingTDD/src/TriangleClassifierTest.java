import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void isCanTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;

        boolean result = TriangleClassifier.isCanTriangle(a,b,c);
        assertTrue(result);

    }

    @Test
    void isDeuTriangle() {
        int a = 2;
        int b = 2;
        int c = 3;

        boolean result = TriangleClassifier.isDeuTriangle(a,b,c);
        assertTrue(result);
    }

    @Test
    void isNormalTriangle() {
        int a = 2;
        int b = 3;
        int c = 4;

        boolean result = TriangleClassifier.isNormalTriangle(a,b,c);
        assertTrue(result);
    }

    @Test
    void isNotTriangle() {
        int a = 0;
        int b = 1;
        int c = 1;

        boolean result = TriangleClassifier.isNotTriangle(a,b,c);
        assertTrue(result);
    }
}