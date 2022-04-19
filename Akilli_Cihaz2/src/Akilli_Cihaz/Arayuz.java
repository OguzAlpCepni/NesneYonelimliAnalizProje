package Akilli_Cihaz;

import java.sql.Connection;
import java.util.Scanner;

public class Arayuz {

    public static boolean kullanicigonder(String user, String pass, UserControl control) {
        if (KullaniciDogrula.getInstance().KullaniciDogrula(user, pass)) {
            return true;
        } else
            return false;
    }

    public static void Islem(MerkeziSistem m) {

        Scanner sc = new Scanner(System.in);
        int secim;
        do {
            System.out.println("\n Lütfen yapmak istediginiz islemi seciniz: \n1-Sicaklik Göster "
                    + "\n2-Sogutucu Ac\n3-Sogutucu Kapa\n4-Cikis");

            secim = sc.nextInt();
            sc.nextLine();

            switch (secim) {
                case 1:
                    System.out.println("Ortam sıcaklığı: " + m.SicaklikGetir());
                    break;
                case 2:
                    m.SogutucuAc();
                    break;
                case 3:
                    m.SogutucuKapa();
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
            System.out.println("username : ");
            String user = scan.next();
            System.out.println("password :");
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