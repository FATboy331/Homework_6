public class Main {
    public static void main(String[] args) {
       Boss boss = new Boss();
       boss.setHealth(100);
       boss.setDamage(50);
       boss.setWeapon(new Weapon("Shot Gun", "Shot Gun"));
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(50);
        skeleton.setDamage(20);
        skeleton.setNumberOfArrows(10);
        skeleton.setWeapon(new Weapon("Лук", "Shot Gun"));
        System.out.println(skeleton.printInfo());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(50);
        skeleton2.setDamage(15);
        skeleton2.setNumberOfArrows(20);
        skeleton2.setWeapon(new Weapon("Лук", "Shot Gun"));
        System.out.println(skeleton2.printInfo());
    }

}