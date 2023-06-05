import java.util.ArrayList;
import java.util.List;
//RentACarOtomasyonu sýnýfý
public class RentACarOtomasyon {
	private List<Araba> araclar;
	private List<Musteri> musteriler;

    public RentACarOtomasyon() {
        araclar = new ArrayList<>();
        musteriler = new ArrayList<>();
    }

    public void aracKirala(Araba araba,Musteri musteri) {
        try {
            araclar.add(araba);
            araba.kirala();
            musteriler.add(musteri);
        } catch (Exception e) {
            System.out.println("Araç kiralama iþlemi sýrasýnda bir hata oluþtu: " + e.getMessage());
        }
    }

    public void aracTeslimEt(Araba araba) {
        try {
            araclar.remove(araba);
            araba.teslimEt();
        } catch (Exception e) {
            System.out.println("Araç teslim etme iþlemi sýrasýnda bir hata oluþtu: " + e.getMessage());
        }
    }

    public void kalanAraclariListele() {
        System.out.println("Kalan Araçlar:");
        for (Araba araba : araclar) {
            System.out.println(araba.getMarka() + " " + araba.getModel());
        }

}
    public void musteriListele() {
        System.out.println("Müþteriler:");
        for (Musteri musteri : musteriler) {
            System.out.println(musteri.getAd() + " " + musteri.getSoyad());
        }
    }
    
}
