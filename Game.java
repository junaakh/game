package game;
public class Game {
    public static void main(String[] args) {
        Player hero = new Player();
        Player enemy = new Player();
        
        hero.name = "Juna";
        hero.speed = 60;
        hero.damage = 10;
        hero.armor = 20;
        hero.healthPoin = 100;
        
        enemy.name = "Jeje";
        enemy.speed = 20;
        enemy.damage = 10;
        enemy.armor = 5;
        enemy.healthPoin = 90;
        
        hero.run();
        hero.attack(enemy.name);
        
        if(hero.isDead()){
            System.out.println("Game Over :(");
        }
        
        Drone DJI = new Drone();
        
        DJI.energi = 50;
        DJI.ketinggian = 80;
        DJI.kecepatan = 100;
        DJI.merek = "Mavid Pro";
        
        DJI.terbang();
        DJI.turun();
        DJI.matikanMesin();
        DJI.belok();
        DJI.maju();
        DJI.mundur();
    }
    
    public static void main(String[] args) {
        Player bertahan = new Player();
        Player penyerang = new Player();
        
        bertahan.name = "Juna";
        bertahan.damage = 10;
        bertahan.armor = 20;
        bertahan.healthPoin = 100;
        
        penyerang.name = "Jeje";
        penyerang.speed = 20;
        penyerang.damage = 10;
        penyerang.armor = 5;
        penyerang.healthPoin = 90;
        
        bertahan.run();
        bertahan.attack(penyerang.name);
        
        if(bertahan.isDead()){
            System.out.println("Game Over :(");
        }
        }
}
