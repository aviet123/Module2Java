package numberregex;

import excercise.ValidationClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONENUMBER_REGEX = "[(][+]\\d{2}[)][-][(]\\d{10}[)]";

    public ValidatePhoneNumber(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
