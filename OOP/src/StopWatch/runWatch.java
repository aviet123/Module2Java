package StopWatch;

public class runWatch {
    public static void main(String[] args) {
        Watchfuntion watchfuntion = new Watchfuntion();
        watchfuntion.start();
        for (int i = 0; i < 1000000000; i++) {
            i += 1;
        }watchfuntion.stop();
        System.out.println(watchfuntion.getElapsedTime());
    }
}
