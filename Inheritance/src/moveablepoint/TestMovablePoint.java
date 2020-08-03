package moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        float[] arrs = moveablePoint.getSpeed();
        for (float x:arrs){
            System.out.println(x);
        }
        System.out.println(moveablePoint.move());

        moveablePoint = new MoveablePoint(3.3f,5.5f,3.4f,3.6f);
        System.out.println(moveablePoint);
        float[] arrs1 = moveablePoint.getSpeed();
        for (float x:arrs1){
            System.out.println(x);
        }
        System.out.println("move speed is: "+ moveablePoint.move());

    }
}
