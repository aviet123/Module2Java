package validate;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail ={"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] inValidEmail ={"@gmail.com", "ab@yahoo.", "@#abc@hotmail.com" };

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email:validEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("valid is: "+ isValid);
        }
        for (String email:inValidEmail){
            boolean inValid = emailExample.validate(email);
            System.out.println("valid is: "+ inValid);
        }
    }


}
