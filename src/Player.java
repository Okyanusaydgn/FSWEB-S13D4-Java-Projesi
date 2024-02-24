public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        checkHealthPercentage(healthPercentage);
        this.weapon = weapon;
    }

    // checkHealthPercentage'ı private yaptık çünkü sadece healthpercentage için kullanacağız. Bunu hep böyle yapmak lazım.
    private void checkHealthPercentage(int healthPercentage){
        if(healthPercentage < 0)

            this.healthPercentage = 0;

        else if(healthPercentage > 100)

            this.healthPercentage = 100;
        else

            this.healthPercentage = healthPercentage;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        int healthRemain = healthPercentage - damage;
        if(healthRemain <= 0){
            System.out.println(name + " player has been knocked out of game  ");
        }
        healthPercentage = healthRemain;
        checkHealthPercentage(healthPercentage);
    }

    public void restore(int healthPotion) {
        this.healthPercentage += healthPotion;
        checkHealthPercentage(this.healthPercentage);
    }

    // toString methodu objenin içeriğini görmemizi sağlar.


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + (weapon.getDamage() + "-" + weapon.getAttackSpeed()) +
                '}';
    }
}


//
 /*
 * @Override anahtar kelimesi, bir alt sınıfta bir üst sınıftaki bir metodun aynı isim ve imza ile tekrar tanımlanmasıdır.
 * Bu, alt sınıfın bu metodu geçersiz kıldığını (override) belirtir.
 *
 * class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}
Burada, Animal adında bir üst sınıfımız var ve makeSound() adında bir metodu bulunuyor. Ardından, Dog adında bir alt sınıf tanımlıyoruz ve bu sınıfın Animal sınıfından kalıtım aldığını belirtiyoruz.
* Dog sınıfı, makeSound() metodunu geçersiz kılar (override) ve kendi davranışını tanımlar.
 * */