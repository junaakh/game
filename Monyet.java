package game;
public class Monyet {
    String hahay;
    int nyawa, damage, armor;
    
    void attack(String hahay){
        System.out.println(hahay +" attacking...");
        System.out.println("Damage: "+ damage);
    }
    void defend(){
        System.out.println(hahay +" defend...");
        System.out.println("defend: "+ armor);
    }
    boolean isDead(){
        if(nyawa <= 0) return true;
        return false;
    }
    
}
