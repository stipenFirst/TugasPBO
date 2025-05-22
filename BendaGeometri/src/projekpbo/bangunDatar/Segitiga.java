package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class Segitiga extends Geometri2D {

    public double sisi;
    public double tinggi;

    private double luasSegitiga;
    private double kelilingSegitiga;

    public Segitiga(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.luasSegitiga = hitungLuas();
        this.kelilingSegitiga = hitungKeliling();
    }

    public double hitungLuas() {
        return 0.5 * sisi * tinggi;
    }

    public double getLuasSegitiga() {
        return luasSegitiga;
    }

    public double hitungKeliling() {
        return 3 * sisi;
    }

    public double getKelilingSegitiga() {
        return kelilingSegitiga;
    }
}
