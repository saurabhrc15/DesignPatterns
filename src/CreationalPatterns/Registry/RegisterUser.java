package CreationalPatterns.Registry;

import static java.lang.System.exit;

public class RegisterUser implements Command {
    @Override
    public void execute(String commandName) {
        System.out.println("User Registered");
    }
}
