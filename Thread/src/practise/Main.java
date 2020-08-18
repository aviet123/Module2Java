package practise;

public class Main {
    public static int DISTANCE = 50;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car car1 = new Car("tuấn");
        Car car2 = new Car("tùng");
        Car car3 = new Car("văn");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        System.out.println("Distance to target: 1m");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
