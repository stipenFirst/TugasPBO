package projekpbo.turunanBola;

import projekpbo.bangunRuang.Bola;

public class TemberengBola extends Bola {

    private double theta;
    private double luasTembereng;
    private double kelilingTembereng;

    public TemberengBola(double jariJari, double theta) {
        super(jariJari);
        this.theta = theta;
    }

    public double hitungLuas() {
        double thetaRad = Math.toRadians(theta);
        luasTembereng = 2 * Math.PI * jariJari * jariJari * (1 - Math.cos(thetaRad / 2));
        return luasTembereng;
    }

    public double getLuasTembereng() {
        return luasTembereng;
    }

    public double hitungKeliling() {
        double thetaRad = Math.toRadians(theta);
        kelilingTembereng = 2 * Math.PI * jariJari * Math.sin(thetaRad / 2);
        return kelilingTembereng;
    }

    public double getKelilingTembereng() {
        return kelilingTembereng;
    }
}
