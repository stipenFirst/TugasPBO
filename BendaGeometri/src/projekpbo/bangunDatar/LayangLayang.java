package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class LayangLayang extends Geometri2D {

    public double diagonal1;
    public double diagonal2;
    public double sisi1;
    public double sisi2;

    private double luasLayangLayang;
    private double kelilingLayangLayang;

    public LayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;

        this.luasLayangLayang = hitungLuas();
        this.kelilingLayangLayang = hitungKeliling();
    }

    public double hitungLuas() {
        // Rumus luas layang-layang = ½ × diagonal1 × diagonal2
        return 0.5 * diagonal1 * diagonal2;
    }

    public double getLuasLayangLayang() {
        return luasLayangLayang;
    }

    public double hitungKeliling() {
        // Keliling = 2 × (sisi1 + sisi2)
        return 2 * (sisi1 + sisi2);
    }

    public double getKelilingLayangLayang() {
        return kelilingLayangLayang;
    }
}
