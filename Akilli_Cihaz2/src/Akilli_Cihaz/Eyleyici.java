package Akilli_Cihaz;

import java.util.ArrayList;


public class Eyleyici implements Subject{

    private ArrayList observers;
    private int temperature;
    private int temp;
    public Eyleyici() {
        observers = new ArrayList();
    }
    public void registerObserver(Observer o) {observers.add(o);}

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            temperature = observer.SogutucuAc(temp);
        }
    }
    public void notifyObservers2() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.SogutucuKapa(temp);
        }
    }
    public int sogutucuAc(int temp) {
        this.temp = temp;
        notifyObservers();
        return temperature;
    }
    public void sogutucuKapa(int temp) {
        this.temp = temp;
        notifyObservers2();
    }
}
