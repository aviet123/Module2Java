package excercise;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        try {
            oddThread.join();
        }catch (Exception e){
            System.out.println(e);
        }
        evenThread.start();
    }
}
