//jip s�n�f� - Araba s�n�f�ndan t�retilen bir alt s�n�f
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
        System.out.println(getMarka() + " " + getModel() + " SUV kiraland�.");
    }

    @Override
    public void teslimEt() {
        System.out.println(getMarka() + " " + getModel() + " SUV teslim edildi.");
    }
}

