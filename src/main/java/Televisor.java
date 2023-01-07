public class Televisor {
    boolean tv;

    public Televisor(boolean tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv = true;

    }

    public void turnOff() {
        tv = false;

    }

    public void showStatus() {
        System.out.println("Telewizor włączony: " + tv);
    }
}
