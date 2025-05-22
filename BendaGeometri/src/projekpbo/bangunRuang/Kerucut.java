package projekpbo.bangunRuang;
import projekpbo.bangunDatar.Lingkaran;

public class Kerucut extends Lingkaran {

    private double tinggiKerucut;
    private double volumeKerucut;
    private double luasPermukaanKerucut;

    public Kerucut(double jariJari, double tinggiKerucut) {
        super(jariJari);
        this.tinggiKerucut = tinggiKerucut;
    }

    public double hitungVolume() {
        volumeKerucut = (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggiKerucut;
        return volumeKerucut;
    }

    public double getVolumeKerucut() {
        return volumeKerucut;
    }

    public double hitungLuasPermukaan() {
        double s = Math.sqrt(jariJari * jariJari + tinggiKerucut * tinggiKerucut);
        luasPermukaanKerucut = Math.PI * jariJari * (jariJari + s);
        return luasPermukaanKerucut;
    }

    public double getLuasPermukaanKerucut() {
        return luasPermukaanKerucut;
    }
}
