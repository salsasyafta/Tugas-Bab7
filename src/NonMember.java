package PrakSIH;
public class NonMember extends Salon{
    private double totalHarga;
    private String anggota;

    public NonMember(String n, String j, String p, String a) {
        super(n, j, p);
        anggota = a;
    }
    public double getTotalHarga() {
        totalHarga = getHargaJasa() + getHargaProduk();
        return totalHarga;
    }
    public String getDescription() {
        return super.getDescription()
                + "Tipe Membership    : " + anggota + "\n"
                + "Layanan            : " + jasa + "\n"
                + "Produk             : " + produk;
    }
}