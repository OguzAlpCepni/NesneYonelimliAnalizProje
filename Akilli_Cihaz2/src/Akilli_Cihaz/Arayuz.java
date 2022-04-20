package Akilli_Cihaz;


import java.util.Scanner;

public class Arayuz {

    public static boolean kullanicigonder(String user, String pass, UserControl control) {
        if (KullaniciDogrula.getInstance().KullaniciDogrula(user, pass)) {
            return true;
        } else
            return false;
    }

    public static void Islem(MerkeziSistem merkeziSistem) {

        Scanner sc = new Scanner(System.in);
        int secim;
        do {
            System.out.println("\n Lütfen yapmak istediginiz islemi seciniz: \n1-Sicaklik Göster "
                    + "\n2-Sogutucu Ac\n3-Sogutucu Kapa\n4-Cikis");

            secim = sc.nextInt();
            sc.nextLine();

            switch (secim) {
                case 1:
                    System.out.println("Ortam sıcaklığı: " + merkeziSistem.SicaklikGetir());
                    break;
                case 2:
                    if(merkeziSistem.SicaklikGetir()%2 == 0)
                        merkeziSistem.SogutucuAc();
                    else
                        merkeziSistem.secondSogutucuAc();


                    break;
                case 3:
                    if(merkeziSistem.SicaklikGetir()%2 == 0)
                        merkeziSistem.SogutucuKapa();
                    else
                        merkeziSistem.secondSogutucuKapat();

                    break;

            }

        } while (secim != 4);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserControl userControl = new UserControl();

        MerkeziSistem merkeziSistem = new MerkeziSistem();
        int sayac = 0;
        boolean temp = false;
        while (sayac < 3) {
            System.out.print("username : ");
            String user = scan.next();
            System.out.print("password : ");
            String password = scan.next();

            if (kullanicigonder(user,password,userControl)) {
                System.out.println("logged");
                temp = true;
                break;
            }
            System.out.println("where yu going");
            sayac++;
        }
        if (temp)
            Islem(merkeziSistem);
        else
            System.out.println("your right of entry has expired");
    }
}