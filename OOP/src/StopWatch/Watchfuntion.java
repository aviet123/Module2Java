package StopWatch;

public class Watchfuntion {
    private long startTime;
    private long endTime;

    Watchfuntion(){
        startTime = System.currentTimeMillis();
    }

    public int start(){
        return (int) (startTime = (int) System.currentTimeMillis());
    }
    public int stop(){
        return (int) (endTime = (int) System.currentTimeMillis());
    }

    public int getElapsedTime(){
        return (int) (endTime - startTime);
    }


}
