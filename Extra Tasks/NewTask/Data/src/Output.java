public class Output {
    private int HpTotal ;
    private int LenovoTotal;
    private int MacTotal;

    public Output(int hpTotal, int lenovoTotal, int macTotal) {
        HpTotal = hpTotal;
        LenovoTotal = lenovoTotal;
        MacTotal = macTotal;
    }

    public int getHpTotal() {
        return HpTotal;
    }

    public void setHpTotal(int hpTotal) {
        HpTotal = hpTotal;
    }

    public int getLenovoTotal() {
        return LenovoTotal;
    }

    public void setLenovoTotal(int lenovoTotal) {
        LenovoTotal = lenovoTotal;
    }

    public int getMacTotal() {
        return MacTotal;
    }

    public void setMacTotal(int macTotal) {
        MacTotal = macTotal;
    }

    @Override
    public String toString() {
        return "2023 {" +
                "Lenovo = " + LenovoTotal +
                ", Hp = " + HpTotal +
                ", Mac = " + MacTotal +
                '}';
    }
}
