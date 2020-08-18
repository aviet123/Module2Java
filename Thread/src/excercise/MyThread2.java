package excercise;

public class MyThread2 extends Thread {
    NumberGenerator numberGenerator;

    MyThread2(NumberGenerator number) {
        this.numberGenerator = number;
    }
    public void run(){
        numberGenerator.run();
    }

}
