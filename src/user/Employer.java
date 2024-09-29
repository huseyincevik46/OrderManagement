package user;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employer implements User {
    private String phoneNumber;
    private String profession;
    private String address;
    private String firstName;
    private String lastName;
    private String cv;

    public Employer(String phoneNumber, String profession, String address, String firstName, String lastName, String cv) {
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cv = cv;
    }

    @Override
    public String getRole() {
        return "Employer";
    }

    @Override
    public void saveToDatabase() {
        String sql = "INSERT INTO employers (phone_number, profession, address, first_name, last_name, cv) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = new DBConnection().connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, phoneNumber);
            pstmt.setString(2, profession);
            pstmt.setString(3, address);
            pstmt.setString(4, firstName);
            pstmt.setString(5, lastName);
            pstmt.setString(6, cv);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}