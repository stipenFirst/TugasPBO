package projekpbo.turunanBola;
import projekpbo.bangunRuang.Bola;

public class JuringBola extends Bola {

    private double theta; // sudut dalam derajat

    private double luasJuring;

    private double kelilingJuring;

    public JuringBola(double jariJari, double theta) {
        super(jariJari);
        this.theta = theta;
    }

    public double hitungLuas() {
        // luas juring = (theta / 360) * luas permukaan bola
        luasJuring = (theta / 360.0) * hitungLuasPermukaan();
        return luasJuring;
    }

    public double getLuasJuring() {
        return luasJuring;
    }

    public double hitungKeliling() {
        double kelilingLingkaranDasar = 2 * Math.PI * jariJari;
        kelilingJuring = (theta / 360.0) * kelilingLingkaranDasar + 2 * jariJari;
        return kelilingJuring;
    }

    public double getKelilingJuring() {
        return kelilingJuring;
    }
}
