package facade;

import command.Command;
import command.CreateEmployerCommand;
import command.CreateJobSeekerCommand;
import command.ViewJobPostingsCommand;
import command.ApplyForJobCommand;

public class JobPortalFacade {

    public void createEmployer(String phoneNumber, String profession, String address, String firstName, String lastName, String cv) {
        Command command = new CreateEmployerCommand(phoneNumber, profession, address, firstName, lastName, cv);
        command.execute();
        System.out.println("Employer created and saved to database.");
    }

    public void createJobSeeker(String phoneNumber, String sector, String address, String companyName) {
        Command command = new CreateJobSeekerCommand(phoneNumber, sector, address, companyName);
        command.execute();
        System.out.println("Job Seeker created and saved to database.");
    }

    public void viewJobPostings() {
        Command command = new ViewJobPostingsCommand();
        command.execute();
    }

    public void applyForJob(int jobSeekerId, int jobId) {
        Command command = new ApplyForJobCommand(jobSeekerId, jobId);
        command.execute();
    }
}