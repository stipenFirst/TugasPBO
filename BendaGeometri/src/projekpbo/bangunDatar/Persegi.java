package projekpbo.bangunDatar;
import projekpbo.Geometri2D;

public class Persegi extends Geometri2D {

    public double sisi;

    private double luasPersegi;
    private double kelilingPersegi;

    public Persegi(double sisi) {
        this.sisi = sisi;
        this.luasPersegi = hitungLuas();
        this.kelilingPersegi = hitungKeliling();
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double getLuasPersegi() {
        return luasPersegi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double getKelilingPersegi() {
        return kelilingPersegi;
    }
}
