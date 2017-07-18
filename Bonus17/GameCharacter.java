import java.util.ArrayList;

/**
 * Created by RIchard on 7/17/2017.
 */
public class GameCharacter {
    private String name;
    private int strength;
    private int intelligence;

    public GameCharacter(){

    }

    public GameCharacter(String NAME, int STR, int INT) {
        name = NAME;
        strength = STR;
        intelligence = INT;
    }

    public  void play() {
        System.out.println("Name: " + name +
                "\nStrength: " + strength +
                "\nIntelligence: " + intelligence);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public static void main(String[] args) {
        ArrayList<GameCharacter> list = new ArrayList<>();
        list.add(new Warrior("Bill", 9, 1, "Club"));
        list.add(new Warrior("Bob", 3, 6, "Sword"));
        list.add(new Wizard("Waldo", 1, 9, 3,1));
        list.add(new Wizard("Gandalf",1,10,5,2));
        list.add(new Wizard("Harry", 2, 7, 4,3));
        for (GameCharacter g: list ) {
            g.play();
        }
    }
}
