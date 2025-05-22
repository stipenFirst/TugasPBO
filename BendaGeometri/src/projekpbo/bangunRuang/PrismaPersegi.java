package projekpbo.bangunRuang;
import projekpbo.bangunDatar.Persegi;
public class PrismaPersegi extends Persegi {

    private double volumeKubus;
    private double luasPermukaanKubus;

    public PrismaPersegi(double sisi) {
        super(sisi);
        this.volumeKubus = hitungVolume();
        this.luasPermukaanKubus = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public double getVolumeKubus() {
        return volumeKubus;
    }

    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public double getLuasPermukaanKubus() {
        return luasPermukaanKubus;
    }
}
