package Inheritaance;

public class Kelinci extends Hewan {

    public Kelinci(String nama, int hp, Float attactPoint) {
        super(nama, hp, attactPoint);
    }
    
    public void loncat(){
        System.out.println("Kelinci Meloncat");
    }

    @Override
    public void berjalan() {
        System.out.println("Kelinci Berjalan");
    }
}
