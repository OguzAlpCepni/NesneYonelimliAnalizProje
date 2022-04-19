package Akilli_Cihaz;

public class MerkeziSistem {
    private int temp=0;
    Eyleyici eyleyici = new Eyleyici();
    EyleyiciModul eyleyiciModul = new EyleyiciModul();
    SicaklikAlgilayici sicaklikAlgilayici = new SicaklikAlgilayici();

    public MerkeziSistem() {eyleyici.registerObserver(eyleyiciModul);}

    public int SicaklikGetir(){
    temp=sicaklikAlgilayici.ReadTemperature();
    return temp;
    }
    public void SogutucuAc() {
        this.temp = eyleyici.sogutucuAc(temp);
        sicaklikAlgilayici.TemperatureUpdate(temp);
    }
    public void SogutucuKapa(){
        eyleyici.sogutucuKapa(temp);}

}


