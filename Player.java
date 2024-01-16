package game;
public class Player {
    String name;
    int speed, healthPoin, damage, armor;
    
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }
    void attack(String name){
        System.out.println(name +" attacking...");
        System.out.println("Damage: "+ damage);
    }
    void defend(){
        System.out.println(name +" defend...");
        System.out.println("defend: "+ armor);
    }
   
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}