import java.util.InputMismatchException;

/**
 * Created by: RIchard
 * Date of Creation: 7/10/2017
 */


public abstract class Player {

    private String name;
    private Roshambo rps_value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Roshambo getRps_value() {
        return rps_value;
    }

    public void setRps_value(Roshambo rps_value) {
        this.rps_value = rps_value;
    }

    public abstract Roshambo generateRoshambo(String rps);

    // What am I doing here..?
    // overloading in an abstract class seems counterproductive
    // if this method was abstract, I'd have to define two different generateRoshambo methods in
    // all my player classes. Dammit.

    @Override
    public String toString() {
        return this.getName();
    }

    public Roshambo generateRoshambo() {
        int i = 1+((int) (Math.random()*3));
        switch(i) {
            case 1: return Roshambo.ROCK;
            case 2: return Roshambo.PAPER;
            case 3: return Roshambo.SCISSORS;
            default: throw new IllegalArgumentException();
        }
    }
}
