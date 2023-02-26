package Unit;

public class Krestyanin extends Hero {

    String builder;
    String repairman;
    String miner;

    public Krestyanin(String name, float hp, int damage, int attack, int def, int maxHp, int speed, String builder,
            String repairman, String miner) {
        super(name, hp, damage, attack, def, maxHp, speed);

        this.builder = builder;
        this.repairman = repairman;
        this.miner = miner;

        System.out.printf("\nСтроитель: %s \nРемонтник: %s \nШахтер: %s ", builder, repairman, miner);
    }

}
