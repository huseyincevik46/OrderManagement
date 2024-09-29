
package command;

import factory.UserFactory;
import factory.JobSeekerFactory;
import user.User;

public class CreateJobSeekerCommand implements Command {
    private final String phoneNumber;
    private final String sector;
    private final String address;
    private final String companyName;

    public CreateJobSeekerCommand(String phoneNumber, String sector, String address, String companyName) {
        this.phoneNumber = phoneNumber;
        this.sector = sector;
        this.address = address;
        this.companyName = companyName;
    }

    @Override
    public void execute() {
        UserFactory userFactory = new JobSeekerFactory(phoneNumber, sector, address, companyName);
        User user = userFactory.createUser();
        user.saveToDatabase();
    }
}