package Akilli_Cihaz;

public class MerkeziSistem {
    private int temp=0;
    Eyleyici eyleyici = new Eyleyici();
    EyleyiciModul eyleyiciModul = new EyleyiciModul();
    SicaklikAlgilayici sicaklikAlgilayici = new SicaklikAlgilayici();
    SogutucuTipi sogutucuTipi = new SogutucuTipi();

    public MerkeziSistem() {eyleyici.registerObserver(eyleyiciModul);}
    public void merkeziSistem(){eyleyici.registerObserver(sogutucuTipi);}
    public int SicaklikGetir(){
    temp=sicaklikAlgilayici.ReadTemperature();
    return temp;
    }
    public void SogutucuAc() {
        this.temp = eyleyici.sogutucuAc(temp); //bu eyleyicinin sogutucu acını cagiriyor
        sicaklikAlgilayici.TemperatureUpdate(temp);
    }
    public void SogutucuKapa(){
        eyleyici.sogutucuKapa(temp);}

    public void secondSogutucuAc(){
        this.temp = sogutucuTipi.SogutucuAc(temp); //bu sogutucunun
        sicaklikAlgilayici.TemperatureUpdate(temp);
    }

    public void secondSogutucuKapat(){
        sogutucuTipi.SogutucuKapa(temp);
    }
}


