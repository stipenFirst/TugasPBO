package projekpbo.bangunDatar;
import projekpbo.Geometri2D;

public class JajarGenjang extends Geometri2D {

    public double alas;
    public double tinggi;
    public double sudutLancip; // dalam derajat

    private double luasJajarGenjang;
    private double kelilingJajarGenjang;
    private double sisiMiringJajarGenjang;

    public JajarGenjang(double alas, double tinggi, double sudutLancip) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sudutLancip = sudutLancip;

        this.luasJajarGenjang = hitungLuas();
        this.sisiMiringJajarGenjang = hitungSisiMiring(); 
        this.kelilingJajarGenjang = hitungKeliling();
    }

    public double hitungLuas() {
        // luas = alas × tinggi
        return alas * tinggi;
    }

    public double getLuasJajarGenjang() {
        return luasJajarGenjang;
    }

    public double hitungSisiMiring() {
        double sudutRad = Math.toRadians(sudutLancip); // ubah ke radian
        return tinggi / Math.sin(sudutRad);
    }

    public double getSisiMiringJajarGenjang() {
        return sisiMiringJajarGenjang;
    }

    public double hitungKeliling() {
        // keliling = 2 × (alas + sisi miring)
        return 2 * (alas + sisiMiringJajarGenjang);
    }

    public double getKelilingJajarGenjang() {
        return kelilingJajarGenjang;
    }
}
