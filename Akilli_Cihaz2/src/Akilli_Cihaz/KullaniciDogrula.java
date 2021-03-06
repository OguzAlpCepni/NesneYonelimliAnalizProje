package Akilli_Cihaz;

import java.sql.*;

public class KullaniciDogrula {

    private static KullaniciDogrula instance;
    private static Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/javadb";
    private String username = "postgres";
    private String password = "03Mfdr03.";

    private Connection getDbConnection() {
        if (connection != null) return connection;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connection successful");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
        return connection;
    }

    public boolean KullaniciDogrula(String username, String password) {
        String query = "SELECT * FROM kullanici WHERE isim=? and sifre=?;";
        try {
            PreparedStatement preQuery = getDbConnection().prepareStatement(query);
            preQuery.setString(1, username);
            preQuery.setString(2, password);
            ResultSet response = preQuery.executeQuery();
            return response.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static KullaniciDogrula getInstance() {
        if (instance == null) {
            instance = new KullaniciDogrula();
        }
        return instance;
    }


}
