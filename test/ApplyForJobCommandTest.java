import command.ApplyForJobCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplyForJobCommandTest {

    @Test
    public void testApplyForJob() {
        int jobSeekerId = 1; 
        int jobId = 1; 

        ApplyForJobCommand command = new ApplyForJobCommand(jobSeekerId, jobId);
        command.execute();
    }}