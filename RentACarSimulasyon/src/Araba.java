
// Araba sýnýfý
public class Araba {
	
	    private String marka;
	    private String model;
	    private int uretimYili;
	    private String renk;
	    private double gunlukKiraBedeli;
	    private int beygirGucu;
	    private boolean otomatik;
	    private int tur;

	    public Araba(String marka, String model, int uretimYili, String renk, double gunlukKiraBedeli) {
	        this.marka = marka;
	        this.model = model;
	        this.uretimYili = uretimYili;
	        this.renk = renk;
	        this.gunlukKiraBedeli = gunlukKiraBedeli;
	        
	    }

	    public String getMarka() {
	        return marka;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getUretimYili() {
	        return uretimYili;
	    }

	    public String getRenk() {
	        return renk;
	    }
	    // Kira bedeli hesaplama iþlemi
public double getGunlukKiraBedeli() {
    return gunlukKiraBedeli;
}

public void kirala() {
    System.out.println(marka + " " + model + " araba kiralandý.");
}

public void teslimEt() {
    System.out.println(marka + " " + model + " araba teslim edildi.");
}


public double kiraBedeliHesapla(int gunSayisi) {
    return gunlukKiraBedeli * gunSayisi;
}
}

