package Akilli_Cihaz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserControl {
    String[] name = new String[10];
    String[] password = new String[10];


    public int UserControl(String user) {
        int deger = 0;
        System.out.println("Wrong User Name");
        return -1;
    }
    public boolean PassControl(String pass,int deger) {
        if(password[deger].equals(pass)) {
            System.out.println("Login successful");
            return true;
        }
        else {
            System.out.println("Wrong Password");
            return false;
        }
    }
}
