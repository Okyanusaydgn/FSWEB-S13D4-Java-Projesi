public class Console {

    public static void main(String[] args){
        Player okyanus = new Player("Okyanus",-80,Weapon.SWORD);
        Player emrah = new Player("Emrah",1000,Weapon.AXE);


        System.out.println(okyanus);
        System.out.println(emrah);

        System.out.println("********");

        emrah.restore(100);
        emrah.loseHealth(30);
        System.out.println(emrah.healthRemaining());
        emrah.loseHealth(100);
        System.out.println(emrah.healthRemaining());
    }
}
