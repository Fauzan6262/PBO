package PBO.tugas;

class mobil extends abstractclass {
    private String harga;

    public mobil(String tipe_mobil, String merk_mobil, String harga) {
        super(tipe_mobil, merk_mobil);
        this.harga = harga;
    }

    public String getharga() {
        return harga;
    }

    @Override
    public void cetak() {
        System.out.println("Tipe mobil : " + getTipe());
        System.out.println("Merk Mobil : " + getMerk());
        System.out.println("Harga Mobil : " + getharga());
        System.out.println("============================");

    }
}