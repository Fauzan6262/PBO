package PBO.tugas;

abstract public class abstractclass {
    private String tipe_mobil;
    private String merk_mobil;

    public abstractclass(String tipe_mobil, String merk_mobil) {
        this.tipe_mobil = tipe_mobil;
        this.merk_mobil = merk_mobil;
    }

    public String getTipe() {
        return tipe_mobil;
    }

    public String getMerk() {
        return merk_mobil;
    }

    public abstract void cetak();
}