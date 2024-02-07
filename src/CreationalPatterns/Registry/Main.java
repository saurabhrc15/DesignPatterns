package CreationalPatterns.Registry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandExcecutorRegistry.addCommand("RegisterUser", new RegisterUser());

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Command...");
            String input = sc.nextLine();
            try {
                CommandExcecutorRegistry.execute(input);
            } catch (InvalidCommandException e) {
                System.out.println("Invalid Command!!");
            }
        }
    }
}
