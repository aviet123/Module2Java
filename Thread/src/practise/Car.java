package practise;

import java.security.PublicKey;
import java.util.Random;

import static practise.Main.DISTANCE;
import static practise.Main.STEP;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        int runDistance = 0;

        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE){
            try{
            int speed = (new Random().nextInt(5));
            runDistance += speed;
            String log = "8";
            int percentTravel = (runDistance * 50) / DISTANCE;
            for (int i = 0; i < DISTANCE; i += STEP) {
                if (percentTravel >= i + STEP) {
                    log += "=";
                } else if (percentTravel >= i && percentTravel < i + STEP) {
                    log += "D";
                } else {
                    log += "-";
                }
            }
            log += "( )o( )đít lâm";
            System.out.println("" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Car" + this.name + " broken...");
            break;
        }
        }
        long endTime = System.currentTimeMillis();
		System.out.println("" + this.name + " had cummed in the ass of Lâm in " + (endTime - startTime) / 1000 + "s");
        }
}
