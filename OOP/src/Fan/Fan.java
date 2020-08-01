package Fan;

public class Fan {
    public static void main(String[] args) {
        FanStructure Fan1 = new FanStructure();
        FanStructure Fan2 = new FanStructure();

        Fan1.setRadius(10);
        Fan1.setSpeed(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);

        Fan2.setRadius(5);
        Fan2.setSpeed(5);
        Fan2.setColor("blue");
        Fan2.setOn(false);

        System.out.println("fan 1 status is:" +Fan1);
        System.out.println("fan 2 status is:" +Fan2);
    }
}
