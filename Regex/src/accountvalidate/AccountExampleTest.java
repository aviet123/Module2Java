package accountvalidate;

public class AccountExampleTest {
    private static AccountExample accountExample;


    public static final String[] validAccount = {"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] inValidAccount = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();

        for (String account: validAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("account valid is :" + isValid);
        }
        for (String account: inValidAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("account valid is: " + isValid);
        }
    }
}
