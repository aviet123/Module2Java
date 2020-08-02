package StopWatch;

public class runWatch {
    public static void main(String[] args) {
        int a = 0;
        int b =0;
        Watchfuntion watchfuntion = new Watchfuntion();
        watchfuntion.start();
        for (int i = 0; i < 10000000; i++) {
            a +=i;
            b +=i;
        }watchfuntion.stop();
        System.out.println(watchfuntion.getElapsedTime());
    }
}
