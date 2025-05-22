package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Bola extends Lingkaran {

    private double volumeBola;

    private double luasPermukaanBola;

    public Bola(double jariJari) {
        super(jariJari);
    }

    public double hitungVolume() {
        volumeBola = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volumeBola;
    }

    public double getVolumeBola() {
        return volumeBola;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanBola = 4 * Math.PI * jariJari * jariJari;
        return luasPermukaanBola;
    }

    public double getLuasPermukaanBola() {
        return luasPermukaanBola;
    }
}
