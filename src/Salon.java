package PrakSIH;
public abstract class Salon {
    public String nama, jasa, produk;
    private double hargaProduk, hargaJasa;

    public Salon(String n, String j, String p) {
        nama = n;
        jasa = j;
        produk = p;
    }
    public void setNama(String n) {
        nama = n;
    }
    public String getNama() {
        return nama;
    }
    public void setJasa(String j) {
        jasa = j;
    }
    public String getJasa() {
        return jasa;
    }
    public void setProduk(String p) {
        produk = p;
    }
    public String getProduk() {
        return produk;
    }
    public double getHargaJasa() {
        if (jasa.equalsIgnoreCase("Gunting Rambut")) {
            hargaJasa = 60000;
        } else if (jasa.equalsIgnoreCase("Cat Rambut")) {
            hargaJasa = 300000;
        } else if (jasa.equalsIgnoreCase("Spa")) {
            hargaJasa = 150000;
        } else if (jasa.equalsIgnoreCase("Full Treatment")) {
            hargaJasa = 500000;
        }
        return hargaJasa;
    }
    public double getHargaProduk() {
        if (produk.equalsIgnoreCase("Vitamin Rambut")) {
            hargaProduk = 45000;
        } else if (produk.equalsIgnoreCase("Masker Rambut")) {
            hargaProduk = 80000;
        } else if (produk.equalsIgnoreCase("Cat Kuku")) {
            hargaProduk = 30000;
        }
        return hargaProduk;
    }
    public abstract double getTotalHarga();
    public String getDescription() {
        return "Nama               : " + getNama() + "\n";
    }
}