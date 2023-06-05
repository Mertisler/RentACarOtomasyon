import java.util.ArrayList;
import java.util.List;
//RentACarOtomasyonu s�n�f�
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
            System.out.println("Ara� kiralama i�lemi s�ras�nda bir hata olu�tu: " + e.getMessage());
        }
    }

    public void aracTeslimEt(Araba araba) {
        try {
            araclar.remove(araba);
            araba.teslimEt();
        } catch (Exception e) {
            System.out.println("Ara� teslim etme i�lemi s�ras�nda bir hata olu�tu: " + e.getMessage());
        }
    }

    public void kalanAraclariListele() {
        System.out.println("Kalan Ara�lar:");
        for (Araba araba : araclar) {
            System.out.println(araba.getMarka() + " " + araba.getModel());
        }

}
    public void musteriListele() {
        System.out.println("M��teriler:");
        for (Musteri musteri : musteriler) {
            System.out.println(musteri.getAd() + " " + musteri.getSoyad());
        }
    }
    
}
