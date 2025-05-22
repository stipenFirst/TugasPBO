package projekpbo.turunanBola;
import projekpbo.bangunRuang.Bola;

public class CincinBola extends Bola {

    private double jariJariDalam;

    private double jarakDuaBidang;

    private double volumeCincinBola;

    private double luasPermukaanCincinBola;

    public CincinBola(double jariJari, double jariJariDalam, double jarakDuaBidang) {
        super(jariJari);
        this.jariJariDalam = jariJariDalam;
        this.jarakDuaBidang = jarakDuaBidang;
    }

    public double hitungVolume() {
        // volume cincin bola = volume bola luar - volume bola dalam
        double volumeBolaLuar = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        double volumeBolaDalam = (4.0 / 3.0) * Math.PI * Math.pow(jariJariDalam, 3);
        volumeCincinBola = volumeBolaLuar - volumeBolaDalam;
        return volumeCincinBola;
    }

    public double getVolumeCincinBola() {
        return volumeCincinBola;
    }

    public double hitungLuasPermukaan() {
    double luasLuar = 4 * Math.PI * Math.pow(jariJari, 2);
    double luasDalam = 4 * Math.PI * Math.pow(jariJariDalam, 2);
    double luasCincinSamping = 2 * Math.PI * (jariJari + jariJariDalam) * jarakDuaBidang;
    luasPermukaanCincinBola = luasLuar + luasDalam + luasCincinSamping;
    return luasPermukaanCincinBola;
}

    public double getLuasPermukaanCincinBola() {
        return luasPermukaanCincinBola;
    }
}
