package projekpbo.bangunDatar;
import projekpbo.Geometri2D;

public class BelahKetupat extends Geometri2D {

    public double diagonal1;
    public double diagonal2;
    public double sisimiringBelahKetupat;

    private double luasBelahKetupat;
    private double kelilingBelahKetupat;

    public BelahKetupat(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;

        this.sisimiringBelahKetupat = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));

        this.luasBelahKetupat = hitungLuas();
        this.kelilingBelahKetupat = hitungKeliling();
    }

    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double getLuasBelahKetupat() {
        return luasBelahKetupat;
    }

    public double hitungKeliling() {
        return 4 * sisimiringBelahKetupat;
    }

    public double getKelilingBelahKetupat() {
        return kelilingBelahKetupat;
    }
}
