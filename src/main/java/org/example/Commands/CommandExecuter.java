package org.example.Commands;

import org.example.GameBoard;

import java.util.ArrayList;
import java.util.List;

public class CommandExecuter {

    private List<Command>commands = new ArrayList<>();

    public CommandExecuter(){
        commands.add(new PlaceCommand());
        commands.add(new MoveCommand());
        commands.add(new RightCommand());
        commands.add(new LeftCommand());
        commands.add(new ReportCommand());
    }


    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute(String input, GameBoard gameBoard) {
        for (Command command: commands) {
            if (command.validate(input)) {
                command.execute(input,gameBoard);
                break;
            }
        }
    }
}
