package PBO.tugas;

public class app {
    public static void main(String[] args) {
        abstractclass mobil1 = new mobil(
                "SUV", "Civic", "Rp.900jT");
        abstractclass mobil2 = new mobil(
                "Sport", "Toyate", "Rp.1.8M");

        mobil1.cetak();
        mobil2.cetak();
    }
}