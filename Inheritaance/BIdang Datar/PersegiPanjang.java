package Inheritaance;

public class PersegiPanjang extends BidangDatar {

    private float panjang;
    private float lebar;
    
    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void keliling() {
        System.out.println("Keliling Persegi Panjang: "+ 2*(panjang*lebar));
    }

    @Override
    public void luas() {
        System.out.println("Luas Persegi Panjang: " + panjang*lebar);
    }
}
