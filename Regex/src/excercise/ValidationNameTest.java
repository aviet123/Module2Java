package excercise;

public class ValidationNameTest {
    private static ValidationClassName validationClassName;

    public static final String[] isValidClassName ={"C0318G","P1234H","A3456H"};
    public static final String[] inValidClassName = {"M0318G","P0323A"};

    public static void main(String[] args) {
        validationClassName = new ValidationClassName();

        for (String name: isValidClassName){
            boolean isValid = validationClassName.validate(name);
            System.out.println("name validation is: " + isValid);
        }
        for (String name: inValidClassName){
            boolean isValid = validationClassName.validate(name);
            System.out.println("name validation is: " + isValid);
        }
    }
}
