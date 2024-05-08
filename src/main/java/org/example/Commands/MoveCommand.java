package org.example.Commands;

import org.example.Direction;
import org.example.GameBoard;
import org.example.Robot;

public class MoveCommand implements Command {

    @Override
    public void execute(String input, GameBoard gameBoard) {
        System.out.println("Executing MOVE Command------");

        if(gameBoard.getRobot().getDirection().equals((String.valueOf(Direction.NORTH)))){

            int newX = gameBoard.getRobot().getX()+1;
            if(newX >= gameBoard.getRowLen()){
                System.out.println("Moving the Toy by 1 unit will result in Toy falling off the board, hence skipping this command");
                return;
            }
            gameBoard.getRobot().setX(newX);
            System.out.println("Moved the Toy in North by 1. new coordinates are " + gameBoard.getRobot().getX() + "," + gameBoard.getRobot().getY());


        }
        else if(gameBoard.getRobot().getDirection().equals((String.valueOf(Direction.SOUTH)))){

            int newX = gameBoard.getRobot().getX() - 1;
            if(newX < 0){
                System.out.println("Moving the Toy by 1 unit will result in Toy falling off the board, hence skipping this command");
                return;
            }
            gameBoard.getRobot().setX(newX);
            System.out.println("Moved the Toy in South by 1. new coordinates are " + gameBoard.getRobot().getX() + "," + gameBoard.getRobot().getY());


        }
        else if(gameBoard.getRobot().getDirection().equals((String.valueOf(Direction.WEST)))){
            int newY = gameBoard.getRobot().getY() - 1;
            if(newY < 0 ){
                System.out.println("Moving the Toy by 1 unit will result in Toy falling off the board, hence skipping this command");
                return;
            }
            gameBoard.getRobot().setY(newY);
            System.out.println("Moved the Toy in West by 1. new coordinates are " + gameBoard.getRobot().getX() + "," + gameBoard.getRobot().getY());


        }
        else if(gameBoard.getRobot().getDirection().equals((String.valueOf(Direction.EAST)))){
            int newY = gameBoard.getRobot().getY() + 1;
            if(newY >= gameBoard.getColLen()){
                System.out.println("Moving the Toy by 1 unit will result in Toy falling off the board, hence skipping this command");
                return;
            }
            gameBoard.getRobot().setY(newY);
            System.out.println("Moved the Toy in East by 1. new coordinates are " + gameBoard.getRobot().getX() + "," + gameBoard.getRobot().getY());

        }

    }

    @Override
    public boolean validate(String input) {
        return input.trim().equals(String.valueOf(CommandKeyword.MOVE));
    }
}
