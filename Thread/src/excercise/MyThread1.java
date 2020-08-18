package excercise;

import java.util.Objects;

public class MyThread1 extends Thread {
    NumberGenerator numberGenerator;

    MyThread1(NumberGenerator number) {
        this.numberGenerator = number;
    }
    public void run(){
        numberGenerator.run();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberGenerator);
    }
}
