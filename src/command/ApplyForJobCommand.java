package command;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.DBConnection;

public class ApplyForJobCommand implements Command {
    private final int jobSeekerId;
    private final int jobId;

    public ApplyForJobCommand(int jobSeekerId, int jobId) {
        this.jobSeekerId = jobSeekerId;
        this.jobId = jobId;
    }

    @Override
    public void execute() {
        String sql = "INSERT INTO job_applications (job_seeker_id, job_posting_id) VALUES (?, ?)";
        try (Connection conn = new DBConnection().connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, jobSeekerId);
            pstmt.setInt(2, jobId);
            pstmt.executeUpdate();
            System.out.println("Applied for job with ID: " + jobId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}