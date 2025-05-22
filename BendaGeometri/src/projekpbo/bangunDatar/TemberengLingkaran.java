package projekpbo.bangunDatar;
public class TemberengLingkaran extends Lingkaran {

    private double taliBusur;
    private double busur;
    private double sudut;

    private double luasTemberengLingkaran;
    private double kelilingTemberengLingkaran;

    public TemberengLingkaran(double jariJari, double taliBusur, double sudut, double busur) {
        super(jariJari);
        this.taliBusur = taliBusur;
        this.sudut = sudut;
        this.busur = busur;
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        double luasJuring = (sudut / 360.0) * Math.PI * jariJari * jariJari;

        double tinggiSegitiga = jariJari - Math.sqrt(jariJari * jariJari - (taliBusur / 2) * (taliBusur / 2));
        double luasSegitiga = 0.5 * taliBusur * tinggiSegitiga;

        luasTemberengLingkaran = luasJuring - luasSegitiga;
        return luasTemberengLingkaran;
    }

    public double getLuasTembereng() {
        return luasTemberengLingkaran;
    }

    public double hitungKeliling() {
        kelilingTemberengLingkaran = busur + 2 * taliBusur;
        return kelilingTemberengLingkaran;
    }

    public double getKelilingTembereng() {
        return kelilingTemberengLingkaran;
    }
}
