//jip sýnýfý - Araba sýnýfýndan türetilen bir alt sýnýf
public class Jip extends Araba {
    private boolean dortCeker;

    public Jip(String marka, String model, int uretimYili, String renk, double gunlukKiraBedeli, boolean dortCeker) {
        super(marka, model, uretimYili, renk, gunlukKiraBedeli);
        this.dortCeker = dortCeker;
    }

    public boolean isDortCeker() {
        return dortCeker;
    }

    @Override
    public void kirala() {
        System.out.println(getMarka() + " " + getModel() + " SUV kiralandý.");
    }

    @Override
    public void teslimEt() {
        System.out.println(getMarka() + " " + getModel() + " SUV teslim edildi.");
    }
}

