package Inheritaance;

public class Burung extends Hewan {

    public Burung(String nama, int hp, Float attactPoint) {
        super(nama, hp, attactPoint);
    }
    
    public void terbang(){
        System.out.println("Burung Terbang");
    }

    @Override
    public void berjalan() {
        System.out.println("Burung Berjalan");
    }
}
