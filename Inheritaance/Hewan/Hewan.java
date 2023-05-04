package Inheritaance;

import java.security.CryptoPrimitive;

public class Hewan {
    private String nama;
    private int hp;
    private float attactPoint;

    public Hewan(String nama, int hp, Float attactPoint){
        this.nama = nama;
        this.hp = hp;
        this.attactPoint = attactPoint;
    }

    public String getNama(){
        return nama;
    }

    public int getHp(){
        return hp;
    }

    public float getAttactPoint(){
        return attactPoint;
    }

    public void berjalan(){
        System.out.println("Hewan Berjalan");
    }
}
