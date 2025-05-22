package projekpbo.bangunRuang;
import projekpbo.bangunDatar.Trapesium;

public class PrismaTrapesium extends Trapesium {

    private double tinggiPrismaTrapesium;

    private double volumePrismaTrapesium;

    private double luasPermukaanPrismaTrapesium;

    public PrismaTrapesium(double alasAtas, double alasBawah, double tinggi, double tinggiPrismaTrapesium) {
        super(alasAtas, alasBawah, tinggi); 
        this.tinggiPrismaTrapesium = tinggiPrismaTrapesium;
    }

    public double hitungVolume() {
        volumePrismaTrapesium = hitungLuas() * tinggiPrismaTrapesium;
        return volumePrismaTrapesium;
    }

    public double getVolumePrismaTrapesium() {
        return volumePrismaTrapesium;
    }

    public double hitungLuasPermukaan() {
        luasPermukaanPrismaTrapesium = 2 * hitungLuas() + getKelilingTrapesium() * tinggiPrismaTrapesium;
        return luasPermukaanPrismaTrapesium;
    }

    public double getLuasPermukaanPrismaTrapesium() {
        return luasPermukaanPrismaTrapesium;
    }
}
