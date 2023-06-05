
// Kamyonet s�n�f� - Araba s�n�f�ndan t�retilen bir alt s�n�f
public class Kamyonet  extends Araba {
    private double yukTasimaKapasitesi;

    public Kamyonet(String marka, String model, int uretimYili, String renk, double gunlukKiraBedeli, double yukTasimaKapasitesi) {
        super(marka, model, uretimYili, renk, gunlukKiraBedeli);
        this.yukTasimaKapasitesi = yukTasimaKapasitesi;
    }

    public double getYukTasimaKapasitesi() {
        return yukTasimaKapasitesi;
    }

    @Override
    public void kirala() {
        System.out.println(getMarka() + " " + getModel() + " kamyonet kiraland�.");
    }

    @Override
    public void teslimEt() {
        System.out.println(getMarka() + " " + getModel() + " kamyonet teslim edildi.");
    }

{

}}
