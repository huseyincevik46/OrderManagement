import org.junit.jupiter.api.Test;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;
import util.DBConnection;

public class DBConnectionTest {

    @Test
    public void testConnection() {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.connect();
        assertNotNull(connection);
    }
}