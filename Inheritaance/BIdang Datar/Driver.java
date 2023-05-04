import Inheritaance.Persegi;
import Inheritaance.PersegiPanjang;

public class Driver {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 5);
        Lingkaran lingkaran = new Lingkaran(4);

        persegi.luas();
        persegi.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        lingkaran.luas();
        lingkaran.keliling();
    }
}
