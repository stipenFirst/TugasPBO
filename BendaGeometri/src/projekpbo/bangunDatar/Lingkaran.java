package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class Lingkaran extends Geometri2D {

    public double jariJari;

    private double luasLingkaran;

    private double kelilingLingkaran;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        luasLingkaran = Math.PI * jariJari * jariJari;
        return luasLingkaran;
    }

    public double getLuasLingkaran() {
        return luasLingkaran;
    }

    public double hitungKeliling() {
        kelilingLingkaran = 2 * Math.PI * jariJari;
        return kelilingLingkaran;
    }

    public double getKelilingLingkaran() {
        return kelilingLingkaran;
    }
}
