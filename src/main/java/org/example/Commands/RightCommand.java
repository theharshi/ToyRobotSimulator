package org.example.Commands;

import org.example.Direction;
import org.example.GameBoard;
import org.example.Robot;

public class RightCommand implements Command {
    @Override
    public void execute(String input, GameBoard gameBoard) {
        Robot robot = gameBoard.getRobot();
        System.out.println("Executing RIGHT Command------");
        if(robot.getDirection().equals((String.valueOf(Direction.NORTH)))){
            System.out.println("Toy moved to it's right direction towards EAST");
            robot.setDirection(String.valueOf(Direction.EAST));
        }
        else if(robot.getDirection().equals((String.valueOf(Direction.SOUTH)))){
            System.out.println("Toy moved to it's right direction towards SOUTH");
            robot.setDirection(String.valueOf(Direction.WEST));
        }
        else if(robot.getDirection().equals((String.valueOf(Direction.WEST)))){
            System.out.println("Toy moved to it's right direction towards NORTH");
            robot.setDirection(String.valueOf(Direction.NORTH));
        }
        else if(robot.getDirection().equals((String.valueOf(Direction.EAST)))){
            System.out.println("Toy moved to it's right direction towards SOUTH");
            robot.setDirection(String.valueOf(Direction.SOUTH));
        }

    }

    @Override
    public boolean validate(String input) {
        return input.trim().equals(String.valueOf(CommandKeyword.RIGHT));
    }
}
