package org.example.Commands;

import org.example.Commands.Command;
import org.example.Commands.CommandKeyword;
import org.example.Direction;
import org.example.GameBoard;
import org.example.Robot;

public class LeftCommand implements Command {

    @Override
    public void execute(String input, GameBoard gameBoard) {
        System.out.println("Executing LEFT Command------");
        Robot robot = gameBoard.getRobot();
        if(robot.getDirection().equals((String.valueOf(Direction.NORTH)))){
            robot.setDirection(String.valueOf(Direction.WEST));
        }
        else if(robot.getDirection().equals((String.valueOf(Direction.SOUTH)))){
            robot.setDirection(String.valueOf(Direction.EAST));
        }
        else if(robot.getDirection().equals((String.valueOf(Direction.WEST)))){
            robot.setDirection(String.valueOf(Direction.SOUTH));
        }
        else if(robot.getDirection().equals((String.valueOf(Direction.EAST)))){
            robot.setDirection(String.valueOf(Direction.NORTH));
        }
        System.out.println("Toy moved to it's left direction");
    }

    @Override
    public boolean validate(String input) {
        return input.trim().equals(String.valueOf(CommandKeyword.LEFT));
    }
}
