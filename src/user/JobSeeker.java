package user;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JobSeeker implements User {
    private String phoneNumber;
    private String sector;
    private String address;
    private String companyName;
    private int id;

    public JobSeeker(String phoneNumber, String sector, String address, String companyName, int id) {
        this.phoneNumber = phoneNumber;
        this.sector = sector;
        this.address = address;
        this.companyName = companyName;
        this.id = id;
    }

    @Override
    public String getRole() {
        return "Job Seeker";
    }

    @Override
    public void saveToDatabase() {
        String sql = "INSERT INTO jobseekers (phone_number, sector, address, company_name, id) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = new DBConnection().connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, phoneNumber);
            pstmt.setString(2, sector);
            pstmt.setString(3, address);
            pstmt.setString(4, companyName);
            pstmt.setInt(5, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}