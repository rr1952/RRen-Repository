package ROSHAMBO;

/**
 * Created by: RIchard
 * Date of Creation: 7/10/2017
 */
public class TheRandom extends Player {

    // should never use this.

    @Override
    public Roshambo generateRoshambo(String str) {
        return generateRoshambo();
    }

    @Override
    public String getName() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "The RPS CPU";
    }

}
