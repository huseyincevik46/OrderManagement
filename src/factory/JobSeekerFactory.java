package factory;

import user.JobSeeker;
import user.User;

import java.util.Random;

public class JobSeekerFactory extends UserFactory {
    private String phoneNumber;
    private String sector;
    private String address;
    private String companyName;

    public JobSeekerFactory(String phoneNumber, String sector, String address, String companyName) {
        this.phoneNumber = phoneNumber;
        this.sector = sector;
        this.address = address;
        this.companyName = companyName;
    }

    @Override
    public User createUser() {
        int id = new Random().nextInt(1000); // Random ID generator
        return new JobSeeker(phoneNumber, sector, address, companyName, id);
    }
}