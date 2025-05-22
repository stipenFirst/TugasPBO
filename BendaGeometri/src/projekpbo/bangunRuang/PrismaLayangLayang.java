package projekpbo.bangunRuang;
import projekpbo.bangunDatar.LayangLayang;
public class PrismaLayangLayang extends LayangLayang {

    private double tinggiPrismaLayangLayang;
    private double volumePrismaLayangLayang;
    private double luasPermukaanPrismaLayangLayang;

    public PrismaLayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2, double tinggiPrismaLayangLayang) {
        super(diagonal1, diagonal2, sisi1, sisi2);
        this.tinggiPrismaLayangLayang = tinggiPrismaLayangLayang;
        this.volumePrismaLayangLayang = hitungVolume();
        this.luasPermukaanPrismaLayangLayang = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        return getLuasLayangLayang() * tinggiPrismaLayangLayang;
    }

    public double getVolumePrismaLayangLayang() {
        return volumePrismaLayangLayang;
    }

    public double hitungLuasPermukaan() {
        return (2 * getLuasLayangLayang()) + (getKelilingLayangLayang() * tinggiPrismaLayangLayang);
    }

    public double getLuasPermukaanPrismaLayangLayang() {
        return luasPermukaanPrismaLayangLayang;
    }
}
