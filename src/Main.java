import facade.JobPortalFacade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JobPortalFacade jobPortal = new JobPortalFacade();
        System.out.println("Enter user type (1 for Employer, 2 for Job Seeker): ");
        int userType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (userType == 1) {
            System.out.println("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter profession: ");
            String profession = scanner.nextLine();
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter CV: ");
            String cv = scanner.nextLine();
            jobPortal.createEmployer(phoneNumber, profession, address, firstName, lastName, cv);
        } else if (userType == 2) {
            System.out.println("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter sector: ");
            String sector = scanner.nextLine();
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            System.out.println("Enter company name: ");
            String companyName = scanner.nextLine();
            jobPortal.createJobSeeker(phoneNumber, sector, address, companyName);
            System.out.println("Viewing available job postings...");
            jobPortal.viewJobPostings();
            System.out.println("Enter the ID of the job you want to apply for: ");
            int jobId = scanner.nextInt();
            System.out.println("Enter your Job Seeker ID: ");
            int jobSeekerId = scanner.nextInt();
            jobPortal.applyForJob(jobSeekerId, jobId);
        } else {
            throw new IllegalArgumentException("Invalid user type");
        }
    }
}