package DesignPatterns.Registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.exit;

public class CommandExcecutorRegistry {
    private static final Map<String, Command> commands = new HashMap<String, Command>();

    private CommandExcecutorRegistry(){}

    public static void addCommand(String commandName, Command command) {
        commands.put(commandName, command);
    }

    public static void removeCommand(String commandName) {
        commands.remove(commandName);
    }

    public static void execute(String commandName) throws InvalidCommandException {
        if (!commands.containsKey(commandName)) {
            throw new InvalidCommandException();
        }
        Command command = commands.get(commandName);
        command.execute(commandName);
    }
}
