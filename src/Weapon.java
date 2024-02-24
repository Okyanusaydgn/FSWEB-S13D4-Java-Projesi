// enum ; numaralandırma bir programda belirli bir türdeki sabitlerin(değişmeyen değerlerin) sınırlı bir listesini temsil etmek için kullanılan bir türdür.
// genellikle gruplandırmalarda kullanılır. Örneğin (kuzey,güney,doğu,batı) veya mevsimler (ilkbahar, yaz, sonbahar, kış)

public enum Weapon {

    SWORD(10,1.8),
    AXE(15,1.5),
    MACE(30,1.2);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
