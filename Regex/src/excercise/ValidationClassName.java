package excercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationClassName {
    private static final String CLASSNAME_REGEX = "[CAP]\\d{4}[G|H|I|K|L|M]";

    public ValidationClassName(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
