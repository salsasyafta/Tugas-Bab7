package PrakSIH;
public class Premium extends Salon {
    private double potonganJasa, potonganProduk, totalHarga;
    private String anggota;

    public Premium(String n, String j, String p, String a) {
        super(n, j, p);
        anggota = a;
    }
    public double getTotalHarga() {
        potonganJasa = getHargaJasa() - (getHargaJasa() * (0.2));
        potonganProduk = getHargaProduk() - (getHargaProduk() * (0.1));
        totalHarga = potonganJasa + potonganProduk;
        return totalHarga;
    }
    public String getDescription() {
        return super.getDescription()
                + "Tipe Membership    : " + anggota + "\n"
                + "Layanan            : " + jasa + "\n"
                + "                     (Diskon 20%)\n"
                + "Produk             : " + produk + "\n"
                + "                     (Diskon 10%)";
    }
}