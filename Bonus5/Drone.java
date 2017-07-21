/**
 * Created by RIchard on 7/19/2017.
 */
public abstract class Drone
{
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    private int x,y,z;
    public Drone (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public abstract void fly(int x1, int y1, int z1);
}

class QuadrotorDrone extends Drone {

    public QuadrotorDrone (int x, int y, int z) {
        super(x,y,z);
    }

    @Override
    public void fly(int x1, int y1, int z1) {
        setX(getX()+x1);
        setY(getY()+y1);
        setZ(getZ()+z1);
    }
}

class DroneTest {

    public static void main(String[] args) {
        Drone d1 = new QuadrotorDrone (5, 5, 5);
        Drone d2 = new QuadrotorDrone (0, 0, 0);
        d2.setX(2);
        d2.setY(2);
        d2.setZ(0);

        for (int n = 1; n <= 5; n++) {
            d1.fly(1, 1, 0);
            d2.fly(0, 0, 1);
            System.out.println("====Round " + n + "====");
            System.out.println("Drone 1: " + d1.getX() + ", " + d1.getY() + ", " + d1.getZ());
            System.out.println("Drone 2: " + d2.getX() + ", " + d2.getY() + ", " + d2.getZ());
        }

    }

}
