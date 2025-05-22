package projekpbo.bangunRuang;
import projekpbo.bangunDatar.Lingkaran;

public class KerucutTerpancung extends Lingkaran {

    private double jarijariAtas;
    private double jariJari; // jari-jari alas
    private double tinggi;
    private double volumeKerucutTerpancung;
    private double luasPermukaanKerucutTerpancung;

    public KerucutTerpancung(double tinggi, double jarijariAtas, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
        this.jarijariAtas = jarijariAtas;
        this.jariJari = jariJari;
    }

    public double hitungVolume() {
        volumeKerucutTerpancung = (1.0 / 3.0) * Math.PI * tinggi * 
            (jariJari * jariJari + jariJari * jarijariAtas + jarijariAtas * jarijariAtas);
        return volumeKerucutTerpancung;
    }

    public double hitungLuasPermukaan() {
        double s = Math.sqrt((jariJari - jarijariAtas) * (jariJari - jarijariAtas) + tinggi * tinggi);
        luasPermukaanKerucutTerpancung = Math.PI * (jariJari + jarijariAtas) * s +
                                          Math.PI * jariJari * jariJari +
                                          Math.PI * jarijariAtas * jarijariAtas;
        return luasPermukaanKerucutTerpancung;
    }

    public double getLuasPermukaanKerucutTerpancung() {
        return luasPermukaanKerucutTerpancung;
    }

    public double getVolumeKerucutTerpancung() {
        return volumeKerucutTerpancung;
    }
}
