package projekpbo.bangunDatar;
public class JuringLingkaran extends Lingkaran {
    private double sudut;
    private double luasJuringLingkaran;
    private double kelilingJuringLingkaran;

    public JuringLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
    }

    public double hitungLuas() {
        // luas juring = (θ/360) * π * r^2
        luasJuringLingkaran = (sudut / 360.0) * Math.PI * jariJari * jariJari;
        return luasJuringLingkaran;
    }

    public double getLuasJuringLingkaran() {
        return luasJuringLingkaran;
    }

    public double hitungKeliling() {
        // keliling juring = 2 * r + (θ / 360) * 2 * π * r
        kelilingJuringLingkaran = 2 * jariJari + (sudut / 360.0) * 2 * Math.PI * jariJari;
        return kelilingJuringLingkaran;
    }

    public double getKelilingJuringLingkaran() {
        return kelilingJuringLingkaran;
    }
}
