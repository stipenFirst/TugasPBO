package projekpbo.bangunDatar;
import projekpbo.Geometri2D;
public class Trapesium extends Geometri2D {

    public double sisiSejajar1;
    public double sisiSejajar2;
    public double tinggi;
    public double sisiMiring;

    private double luasTrapesium;
    private double kelilingTrapesium;

    public Trapesium(double sisiSejajar1, double sisiSejajar2, double tinggi) {
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.tinggi = tinggi;
        this.sisiMiring = hitungSisiMiring();
        this.luasTrapesium = hitungLuas();
        this.kelilingTrapesium = hitungKeliling();
    }

    private double hitungSisiMiring() {
        double setengahSelisih = Math.abs(sisiSejajar1 - sisiSejajar2) / 2.0;
        return Math.sqrt(tinggi * tinggi + setengahSelisih * setengahSelisih);
    }

    public double hitungLuas() {
        return 0.5 * (sisiSejajar1 + sisiSejajar2) * tinggi;
    }

    public double getLuasTrapesium() {
        return luasTrapesium;
    }

    public double hitungKeliling() {
        return sisiSejajar1 + sisiSejajar2 + 2 * sisiMiring;
    }

    public double getKelilingTrapesium() {
        return kelilingTrapesium;
    }
}
