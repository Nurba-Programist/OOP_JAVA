package Unit;

public class Kopeishik extends Hero {

    protected String weapon;

    public Kopeishik(String name, float hp, int damage, int attack, int def, int maxHp, int speed, String weapon) {
        super(name, hp, maxHp, damage, attack, def, speed);
        this.weapon = weapon;

        System.out.printf("\nОружие: %s", weapon);
    }

}
