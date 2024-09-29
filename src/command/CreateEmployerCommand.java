
package command;

import user.Employer;
import factory.UserFactory;

public class CreateEmployerCommand implements Command {
    private UserFactory userFactory;

    public CreateEmployerCommand(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    public CreateEmployerCommand(String phoneNumber, String profession, String address, String firstName, String lastName, String cv) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void execute() {
        Employer employer = (Employer) userFactory.createUser();
        employer.saveToDatabase();
    }
}