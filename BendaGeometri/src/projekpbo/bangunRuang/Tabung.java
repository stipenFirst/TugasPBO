package projekpbo.bangunRuang;
import projekpbo.bangunDatar.Lingkaran;

public class Tabung extends Lingkaran {
    private double tinggiSilinder;
    private double volumeSilinder;
    private double luasPermukaanSilinder;

    public Tabung(double jariJari, double tinggiSilinder) {
        super(jariJari);
        this.tinggiSilinder = tinggiSilinder;
    }

    public double hitungVolume() {
        volumeSilinder = Math.PI * jariJari * jariJari * tinggiSilinder;
        return volumeSilinder;
    }

    public double getVolumeSilinder() {
        return volumeSilinder;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanSilinder = 2 * Math.PI * jariJari * (jariJari + tinggiSilinder);
        return luasPermukaanSilinder;
    }

    public double getLuasPermukaanSilinder() {
        return luasPermukaanSilinder;
    }
}
