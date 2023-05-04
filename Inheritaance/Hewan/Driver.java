package Inheritaance;

public class Driver {
    public static void main(String[] args) {

        Kelinci kelinci = new Kelinci("Kelinci1", 100, 0.5f);
        System.out.println("Nama: " + kelinci.getNama());
        System.out.println("HP: " + kelinci.getHp());
        System.out.println("Attact Point: " + kelinci.getAttactPoint());
        kelinci.berjalan();
        kelinci.loncat();
        
        Burung burung = new Burung("Burung1", 100, 0.5f);
        System.out.println("Nama: " + burung.getNama());
        System.out.println("HP: " + burung.getHp());
        System.out.println("Attact Point: " + burung.getAttactPoint());
        burung.berjalan();
        burung.terbang();

        Kuda kuda = new Kuda("Kuda1", 100, 0.5f);
        System.out.println("Nama: " + kuda.getNama());
        System.out.println("HP: " + kuda.getHp());
        System.out.println("Attact Point: " + kuda.getAttactPoint());
        kuda.berjalan();

    }
}
