package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection connect() {
        // DB bağlantı detaylarını buraya ekleyin
        String url = "jdbc:postgresql://localhost:5432/cms";
        String user = "postgres";
        String password = "postgresql46";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}