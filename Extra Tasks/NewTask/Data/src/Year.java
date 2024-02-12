import java.util.LinkedList;

public class Year {
    Lenovo lenovo;
    Mac mac;
    HP hp;
    private int month;

    public Year(Lenovo lenovo, Mac mac, HP hp, int month) {
        this.lenovo = lenovo;
        this.mac = mac;
        this.hp = hp;
        this.month = month;
    }

    public Lenovo getLenovo() {
        return lenovo;
    }

    public void setLenovo(Lenovo lenovo) {
        this.lenovo = lenovo;
    }

    public Mac getMac() {
        return mac;
    }

    public void setMac(Mac mac) {
        this.mac = mac;
    }

    public HP getHp() {
        return hp;
    }

    public void setHp(HP hp) {
        this.hp = hp;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
