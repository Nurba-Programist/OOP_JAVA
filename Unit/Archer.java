package Unit;

public abstract class Archer extends Hero {

    int shots, maxShots;
    float dist;

    public Archer(String name, float hp, int maxHp, int damage, int attack, int def, int speed, int shots, int maxShots,
            float dist) {
        super(name, hp, maxHp, damage, attack, def, speed);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;

        System.out.printf("\nВыстрел: %s \nМакс/Выстрел: %s \nДистанция: %s", shots, maxShots, dist);
    }

    public float getDist() {
        return dist;
    }
}
