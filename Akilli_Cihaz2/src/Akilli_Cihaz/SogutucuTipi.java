package Akilli_Cihaz;

public class SogutucuTipi implements Observer{
    private int Temp;
    @Override
    public int SogutucuAc(int temp) {
        System.out.println("Soğutucu Çalıştırılıyor");
        Temp -= 2;
        return Temp+temp; //-2 yi döndürüyor
    } // buraya temp ekledim ben

    @Override
    public void SogutucuKapa(int temp) {
        System.out.println("Sogutucu kapatiliyor");

    }
}
