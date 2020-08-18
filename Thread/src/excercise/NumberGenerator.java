package excercise;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        MyThread1 myThread1 = new MyThread1(numberGenerator);
        MyThread2 myThread2 = new MyThread2(numberGenerator);
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.MIN_PRIORITY);
        myThread2.start();
        myThread1.start();

    }
}
