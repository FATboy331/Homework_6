public class Weapon {
    private String weaponName;

    private String weaponType;

    public String getWeaponType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public Weapon(String weaponName, String weaponType){
    this.weaponName = weaponName;
    this.weaponType = weaponType;
}
@Override
public String toString(){
        return this.weaponName + " " + this.weaponType;
}

}
