/**
 * Created by RIchard on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter{
    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }

    private int magicalEnergy;

    public MagicUsingCharacter(String NAME, int STR, int INT, int magEN) {
        setName(NAME);
        setStrength(STR);
        setIntelligence(INT);
        this.magicalEnergy = magEN;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Magical Energy: " + magicalEnergy);
    }

}
