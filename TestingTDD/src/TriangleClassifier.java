public class TriangleClassifier {


    public static boolean isCanTriangle(int sideA, int sideB, int sideC) {
        boolean canConditional = sideA == sideB && sideB == sideC;
        if (canConditional) {
            boolean canConditional2 = sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB;
            if (canConditional2) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDeuTriangle(int sideA, int sideB, int sideC) {
        boolean deuConditional = sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB;
        if (deuConditional) {
            boolean deuConditional2 = sideA == sideB || sideB == sideC || sideC == sideA;
            if (deuConditional2)
                return true;
            }
        return false;
        }

    public static boolean isNormalTriangle(int sideA, int sideB, int sideC) {
        boolean normalTgCondition = sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB;
        if (normalTgCondition) {
            boolean normalConditional2 = sideA != sideB && sideB != sideC && sideC != sideA;
            if (normalConditional2)
                return true;
        }
        return false;
    }
    public static boolean isNotTriangle(int sideA, int sidaB, int sideC) {
        boolean notTriangleConditional = sideA + sidaB < sideC || sidaB + sideC < sideA || sideC + sideA < sidaB
                || sideA <= 0 || sidaB <= 0 || sideC <= 0;
        if (notTriangleConditional) {
                return true;
        }
        return false;
    }
}

