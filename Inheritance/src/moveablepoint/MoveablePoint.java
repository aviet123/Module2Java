package moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] Array = {this.xSpeed, this.ySpeed,getX(),getY()};
        return Array;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                " x: "+ getX()+
                " y: "+ getY()+
                " speed is: "+this.xSpeed+this.ySpeed+
                " which is subclass of " + super.toString();
    }
    public MoveablePoint move(){
        x += this.xSpeed;
        y += this.ySpeed;
        return this;
    }
}
