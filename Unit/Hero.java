package Unit;

public abstract class Hero {

    public String name;
    private float hp;
    public int damage;
    public int attack;
    public int def;
    public int maxHp;
    public int speed;

    public Hero(String name, float hp, int damage, int attack, int def, int maxHp, int speed) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.attack = attack;
        this.def = def;
        this.maxHp = maxHp;
        this.speed = speed;

        System.out.printf("\n%s \nЗдороье: %s \nПовреждение: %s \nАтака: %s \nЗащита: %s \nМакс/Здоровье: %s", name, hp,
                damage, attack, def, maxHp);

    }

    public Hero(String name2, int health, String work, String attack2, String speed) {
    }

    public String getName() {
        return name;
    }

    public float getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getAttack() {
        return attack;
    }

    public int getDef() {
        return def;
    }

    public int getMaxhp() {
        return maxHp;
    }

    public int getSpeed() {
        return speed;
    }

}