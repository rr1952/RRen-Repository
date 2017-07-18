/**
 * Created by RIchard on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {
    private int spellNumber;

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    public Wizard (String NAME, int STR, int INT, int magEN, int spellNUM) {
        super(NAME, STR, INT, magEN);
        setSpellNumber(spellNUM);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Spell Number: " + spellNumber);
    }

}
