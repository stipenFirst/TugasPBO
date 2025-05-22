package projekpbo.bangunRuang;

import projekpbo.bangunDatar.JajarGenjang;

public class PrismaJajarGenjang extends JajarGenjang {

    private double tinggiPrismaJajarGenjang;
    private double volumePrismaJajarGenjang;
    private double luasPermukaanPrismaJajarGenjang;

    public PrismaJajarGenjang(double alas, double tinggi, double sudutlancip, double tinggiPrismaJajarGenjang) {
        super(alas, tinggi, sudutlancip);
        this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
        this.volumePrismaJajarGenjang = hitungVolume();
        this.luasPermukaanPrismaJajarGenjang = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        // Volume prisma = luas alas × tinggi prisma
        return getLuasJajarGenjang() * tinggiPrismaJajarGenjang;
    }

    public double getVolumePrismaJajarGenjang() {
        return volumePrismaJajarGenjang;
    }

    public double hitungLuasPermukaan() {
        // Luas permukaan prisma = 2 × luas alas + keliling alas × tinggi prisma
        return (2 * getLuasJajarGenjang()) + (getKelilingJajarGenjang() * tinggiPrismaJajarGenjang);
    }

    public double getLuasPermukaanPrismaJajarGenjang() {
        return luasPermukaanPrismaJajarGenjang;
    }
}
