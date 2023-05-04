public class Lingkaran extends BidangDatar {
    public Lingkaran(float r){
        this.r = r;
    }

    @Override
    public void keliling() {
        System.out.println("Keliling Lingkaran: "+ 2*Math.PI*r);
    }

    @Override
    public void luas() {
        System.out.println("Luas Lingkaran: " + Math.PI*r*r);
    }
}