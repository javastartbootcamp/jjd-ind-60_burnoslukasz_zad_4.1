package pl.javastart.task;

import data.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor(false);
        televisor1.showStatus();
        televisor1.turnOn();
        televisor1.showStatus();
    }
}
