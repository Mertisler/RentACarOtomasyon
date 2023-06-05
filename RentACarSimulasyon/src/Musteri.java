

public class Musteri {

	private String ad;
    private String soyad;
    private String telefon;
    private String email;

    public Musteri(String ad, String soyad, String telefon, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.email = email;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }
}
