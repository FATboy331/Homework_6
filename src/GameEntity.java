public abstract class GameEntity {
    private int health;

    private int damage;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }
    public String printInfo(){
        return this.health + " " + this.damage;
    }
}
