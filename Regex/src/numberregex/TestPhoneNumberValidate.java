package numberregex;

public class TestPhoneNumberValidate {
    private static ValidatePhoneNumber validatePhoneNumber;

    public static final String[] isValidPhoneNumber = {"(+84)-(0978489648)","(+45)-(0123456789)"};
    public static final String[] inValidPhoneNumber = {"(a8)-(22222222)","(b8)-(11111111)"};

    public static void main(String[] args) {
        validatePhoneNumber = new ValidatePhoneNumber();

        for (String phone: isValidPhoneNumber){
            boolean isValid = validatePhoneNumber.validate(phone);
            System.out.println("số điện thoại: "+phone+" valid is: "+ isValid);
        }
        for (String phone: inValidPhoneNumber){
            boolean isValid = validatePhoneNumber.validate(phone);
            System.out.println("số điện thoại: "+ phone +" valid is: "+ isValid);
        }
    }
}
