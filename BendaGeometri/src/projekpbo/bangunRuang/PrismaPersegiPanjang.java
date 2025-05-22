package projekpbo.bangunRuang;
import projekpbo.bangunDatar.PersegiPanjang;

public class PrismaPersegiPanjang extends PersegiPanjang {

    private double tinggiBalok;
    private double volumeBalok;
    private double luasPermukaanBalok;

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggiBalok) {
        super(panjang, lebar);
        this.tinggiBalok = tinggiBalok;
        this.volumeBalok = hitungVolume();
        this.luasPermukaanBalok = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        return panjang * lebar * tinggiBalok;
    }

    public double getVolumeBalok() {
        return volumeBalok;
    }

    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggiBalok + lebar * tinggiBalok);
    }

    public double getLuasPermukaanBalok() {
        return luasPermukaanBalok;
    }
}
