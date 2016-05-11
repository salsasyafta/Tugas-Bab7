package PrakSIH;
public class Gold extends Salon {
    private double potonganJasa, potonganProduk, totalHarga;
    private String anggota;

    public Gold(String n, String j, String p, String a) {
        super(n, j, p);
        anggota = a;
    }
    public double getTotalHarga() {
        potonganJasa = getHargaJasa() - (getHargaJasa() * (0.15));
        potonganProduk = getHargaProduk() - (getHargaProduk() * (0.1));
        totalHarga = potonganJasa + potonganProduk;
        return totalHarga;
    }
    public String getDescription() {
        return super.getDescription()
                + "Tipe Membership    : " + anggota + "\n"
                + "Layanan            : " + jasa + "\n"
                + "                     (Diskon 15%)\n"
                + "Produk             : " + produk + "\n"
                + "                     (Diskon 10%)";
    }
}