package Unit;

public class Koldun extends Hero {

    int magic, maxMagic;

    public Koldun(String name, int magic, int maxMagic, float hp, int damage, int attack, int def, int maxHp,
            int speed) {
        super(name, hp, damage, attack, def, maxHp, speed);

        this.magic = magic;
        this.maxMagic = maxMagic;

        System.out.printf("\nМагия: %s \nМакс/Магия %s", magic, maxMagic);
    }

}
