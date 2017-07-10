/**
 * Created by: RIchard
 * Date of Creation: 7/10/2017
 */

/**
 * This class always throws Rock in our Roshambo.
 */
public class TheRocks extends Player {

    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }

    // should never really be using this, but I have to implement this...
    @Override
    public Roshambo generateRoshambo(String s) {
        return Roshambo.ROCK;
    }

    @Override
    public String getName() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "The Rocks";
    }

}
