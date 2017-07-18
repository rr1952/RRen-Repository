/**
 * Created by RIchard on 7/17/2017.
 */
public class Warrior extends GameCharacter{

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    private String weaponType;

    public Warrior (String NAME, int STR, int INT, String wepType){
        super(NAME, STR, INT);
        setWeaponType(wepType);

    }

    @Override
    public void play() {
        super.play();
        System.out.println("Weapon Type: " +weaponType);
    }

}
