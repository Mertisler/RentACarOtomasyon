

public class Main {
	public static void main(String[] args) {
        RentACarOtomasyon otomasyon = new RentACarOtomasyon();

        Araba araba1 = new Araba("Ford", "Focus", 2020, "Beyaz", 200);
        Jip jip = new Jip("Audi", "Q7", 2022, "Gri", 500, true);
        Kamyonet kamyonet1 = new Kamyonet("Toyota", "Hilux", 2021, "Siyah", 400, 1000);
        Musteri musteri1 = new Musteri("Yaman", "Akbulut", "5521234567", "yaman@akbulut.com");
        Musteri musteri2 = new Musteri("ÇAÐRI", "ÞAHÝN", "5469787522", "çagri@sahin.com");


        otomasyon.aracKirala(araba1, musteri1);
        System.out.println("*******************");
        otomasyon.aracKirala(jip, musteri2);
        System.out.println("*******************");
        otomasyon.aracKirala(kamyonet1, musteri1);
        System.out.println("*******************");

        otomasyon.kalanAraclariListele();
        System.out.println("*******************");
        otomasyon.musteriListele();
        System.out.println("*******************");

        otomasyon.aracTeslimEt(araba1);
        System.out.println("*******************");

        otomasyon.kalanAraclariListele();
        System.out.println("*******************");
        otomasyon.musteriListele();
        System.out.println("*******************");
    }

}
