package Inheritaance;

import javax.swing.text.FlowView;

public class Persegi extends BidangDatar {
    private float sisi;

    public Persegi(float sisi){
        this.sisi = sisi;
    }

    @Override
    public void keliling() {
        System.out.println("Keliling Persegi: "+ sisi*4);
    }

    @Override
    public void luas() {
        System.out.println("Luas Persegi: " + sisi*sisi);
    }
}
