package factory;

import user.Employer;
import user.User;

public class EmployerFactory extends UserFactory {
    private String phoneNumber;
    private String profession;
    private String address;
    private String firstName;
    private String lastName;
    private String cv;

    public EmployerFactory(String phoneNumber, String profession, String address, String firstName, String lastName, String cv) {
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cv = cv;
    }

    @Override
    public User createUser() {
        return new Employer(phoneNumber, profession, address, firstName, lastName, cv);
    }
}