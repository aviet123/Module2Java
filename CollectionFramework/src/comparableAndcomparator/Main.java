package comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("Văn"));
        simpsons.add(new Simpson("Anh"));
        simpsons.add(new Simpson("Lâm"));
        simpsons.add(new Simpson("Nghĩa"));

        Collections.sort(simpsons);

        simpsons.stream().map(s -> s.name).forEach(System.out::print);

        Collections.reverse(simpsons);

    }
}
