package projekpbo.bangunRuang;
import projekpbo.bangunDatar.Segitiga;

public class PrismaSegitiga extends Segitiga {

    private double tinggiPrismaSegitiga;
    private double volumePrismaSegitiga;
    private double luasPermukaanPrismaSegitiga;

    public PrismaSegitiga(double alas, double tinggi, double tinggiPrismaSegitiga) {
        super(alas, tinggi);
        this.tinggiPrismaSegitiga = tinggiPrismaSegitiga;
        this.volumePrismaSegitiga = hitungVolume();
        this.luasPermukaanPrismaSegitiga = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        return hitungLuas() * tinggiPrismaSegitiga;
    }

    public double getVolumePrismaSegitiga() {
        return volumePrismaSegitiga;
    }

    public double hitungLuasPermukaan() {
        return (2 * hitungLuas()) + (hitungKeliling() * tinggiPrismaSegitiga);
    }

    public double getLuasPermukaanPrismaSegitiga() {
        return luasPermukaanPrismaSegitiga;
    }
}
