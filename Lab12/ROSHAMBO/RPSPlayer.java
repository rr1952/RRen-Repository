package ROSHAMBO;

/**
 * Created by: RIchard
 * Date of Creation: 7/10/2017
 */
public class RPSPlayer extends Player {

    @Override
    public Roshambo generateRoshambo(String str) {
        switch (str) {
            case "R": return Roshambo.ROCK;
            case "P": return Roshambo.PAPER;
            case "S": return Roshambo.SCISSORS;
            // random ROSHAMBO.Roshambo pick that all players have.
            case "": return generateRoshambo();
            default: throw new IllegalArgumentException();
        }
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
