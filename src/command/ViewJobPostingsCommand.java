package command;

import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewJobPostingsCommand implements Command {

    @Override
    public void execute() {
        String sql = "SELECT * FROM job_postings";
        try (Connection conn = new DBConnection().connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int jobId = rs.getInt("id");
                double salary = rs.getDouble("salary");
                String positionName = rs.getString("position_name");
                String companyName = rs.getString("company_name");
                String location = rs.getString("location");
                String requirements = rs.getString("requirements");
                System.out.println("Job ID: " + jobId);
                System.out.println("Salary: " + salary);
                System.out.println("Position Name: " + positionName);
                System.out.println("Company Name: " + companyName);
                System.out.println("Location: " + location);
                System.out.println("Requirements: " + requirements);
                System.out.println("------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}