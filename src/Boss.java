public class Boss extends GameEntity {
public Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return super.printInfo() + " " + this.weapon;
    }
}
