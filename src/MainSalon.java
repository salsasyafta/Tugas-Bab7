package PrakSIH;
public class MainSalon {
    public static void main(String[] args) {
        Salon premium;        
        Salon gold;
        Salon silver;
        Salon nonmember;

        premium = new Premium("Pevita", "Spa", "Cat Kuku", "Premium");
        gold = new Gold("Raline", "Gunting Rambut", "Vitamin Rambut", "Gold");
        silver = new Silver("Dian", "Cat Rambut", "Masker Rambut", "Silver");
        nonmember = new NonMember("Raisa", "Full Treatment", "Cat Kuku", "NonMember");
        
        System.out.println("          SALSA SALON N SPA          ");
        System.out.println("=====================================");
        System.out.println(premium.getDescription());
        System.out.print("Total Pembayaran   : Rp." + premium.getTotalHarga() + "\n");
        System.out.println("-------------------------------------");
        System.out.println(gold.getDescription());
        System.out.print("Total Pembayaran   : Rp." + gold.getTotalHarga() + "\n");
        System.out.println("-------------------------------------");
        System.out.println(silver.getDescription());
        System.out.print("Total Pembayaran   : Rp." + silver.getTotalHarga() + "\n");
        System.out.println("-------------------------------------");
        System.out.println(nonmember.getDescription());
        System.out.print("Total Pembayaran   : Rp." + nonmember.getTotalHarga() + "\n");
        System.out.println("-------------------------------------");
    }
}