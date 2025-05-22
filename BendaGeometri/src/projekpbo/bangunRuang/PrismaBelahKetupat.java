package projekpbo.bangunRuang;
import projekpbo.bangunDatar.BelahKetupat;

public class PrismaBelahKetupat extends BelahKetupat {

    private double tinggiPrisma;
    private double volumePrismaBelahKetupat;
    private double luasPermukaanPrismaBelahKetupat;

    public PrismaBelahKetupat(double diagonal1, double diagonal2, double tinggiPrisma) {
        super(diagonal1, diagonal2);
        this.tinggiPrisma = tinggiPrisma;
        this.volumePrismaBelahKetupat = hitungVolume();
        this.luasPermukaanPrismaBelahKetupat = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        // Volume prisma = luas alas × tinggi prisma
        return getLuasBelahKetupat() * tinggiPrisma;
    }

    public double getVolumePrismaBelahKetupat() {
        return volumePrismaBelahKetupat;
    }

    public double hitungLuasPermukaan() {
        // Luas permukaan prisma = 2 × luas alas + keliling alas × tinggi prisma
        return (2 * getLuasBelahKetupat()) + (getKelilingBelahKetupat() * tinggiPrisma);
    }

    public double getLuasPermukaanPrismaLayangLayang() {
        return luasPermukaanPrismaBelahKetupat;
    }
}
