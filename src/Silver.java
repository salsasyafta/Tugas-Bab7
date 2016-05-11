package PrakSIH;
public class Silver extends Salon {
    private double potonganJasa, potonganProduk, totalHarga;
    private String anggota;

    public Silver(String n, String j, String p, String a) {
        super(n, j, p);
        anggota = a;
    }
    public double getTotalHarga() {
        potonganJasa = getHargaJasa() - (getHargaJasa() * (0.1));
        potonganProduk = getHargaProduk() - (getHargaProduk() * (0.1));
        totalHarga = potonganJasa + potonganProduk;
        return totalHarga;
    }
    public String getDescription() {
        return super.getDescription()
                + "Tipe Membership    : " + anggota + "\n"
                + "Layanan            : " + jasa + "\n"
                + "                     (Diskon 10%)\n"
                + "Produk             : " + produk + "\n"
                + "                     (Diskon 10%)";
    }
}