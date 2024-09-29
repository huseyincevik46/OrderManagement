import command.ViewJobPostingsCommand;
import org.junit.jupiter.api.Test;



public class ViewJobPostingsCommandTest {

    @Test
    public void testViewJobPostings() {
        ViewJobPostingsCommand command = new ViewJobPostingsCommand();
        command.execute();

        
    }
}