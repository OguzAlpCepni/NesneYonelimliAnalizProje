package Akilli_Cihaz;

import java.util.Random;

public class SicaklikAlgilayici {
    private int temp;
    public SicaklikAlgilayici() {
        Random rand = new Random();
        this.temp = rand.nextInt(30)+20;

    }
    public int ReadTemperature() {
        return temp;
    }
    public void TemperatureUpdate(int t) {
        this.temp = t;
    }
}
