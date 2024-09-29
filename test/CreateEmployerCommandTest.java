import command.CreateEmployerCommand;
import org.junit.jupiter.api.Test;



public class CreateEmployerCommandTest {

    @Test
    public void testCreateEmployer() {
        String phoneNumber = "05378650465";
        String profession = "Software Engineer";
        String address = " MALATYA ";
        String firstName = "Osman";
        String lastName = "Durmaz";
        String cv = "Osman_durmaz_cv.pdf";

        CreateEmployerCommand command = new CreateEmployerCommand(phoneNumber, profession, address, firstName, lastName, cv);
        command.execute();
    }}