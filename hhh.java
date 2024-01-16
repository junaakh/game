package game;

public class hhh {
    int energi;
    int jauh;
    int lari;
    String Hewan;
    
    void lari(){
        energi--;
        if(energi > 10){
            jauh++;
            System.out.println("Monyet lari...");
        } else {
            System.out.println("Monyet capek...");
        }
    }

    void monyetIstirahat(){
        if(jauh > 0){
            System.out.println("Monyet istirahat");
        }
    }

    void balik  (){
        energi--;
        System.out.println("Monyet berbalik arah");
    }

    void mundur(){
        energi--;
        System.out.println("Monyet jalan mundur");
        lari++;
    }
}
