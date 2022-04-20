package Akilli_Cihaz;


public interface Subject {
    public void registerObserver(Observer o);

    public void notifyObservers();
    public void notifyObservers2();
}
