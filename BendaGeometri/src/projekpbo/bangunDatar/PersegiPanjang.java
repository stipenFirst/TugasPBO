package projekpbo.bangunDatar;
import projekpbo.Geometri2D;
public class PersegiPanjang extends Geometri2D {

    public double panjang;
    public double lebar;

    private double luasPersegiPanjang;
    private double kelilingPersegiPanjang;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luasPersegiPanjang = hitungLuas();
        this.kelilingPersegiPanjang = hitungKeliling();
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getKelilingPersegiPanjang() {
        return kelilingPersegiPanjang;
    }
}
