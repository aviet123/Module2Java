package point;

public class Point3D extends Point2D {
    private float z = 0.0f;
    Point3D(){

    }
    Point3D(float x,float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] Array = {getX(),getY(),getZ()};
        return Array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                " which is subclass of " + super.toString();
    }
}
