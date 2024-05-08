package org.example.Commands;

import org.example.GameBoard;


public class PlaceCommand implements Command {

    @Override
    public void execute(String cmd, GameBoard gameBoard) {
        System.out.println("Executing PLACE Command------");

        try {
            String[] parts = cmd.substring(5).trim().split(",");
            int newX = Integer.parseInt(parts[0]);
            int newY = Integer.parseInt(parts[1]);
            String direction = parts[2];
            if(newX < 0 || newX >= gameBoard.getRowLen() || newY < 0 || newY >= gameBoard.getColLen()){
                System.out.println("Given coordinates are not on the board. please provide coordinates which are on the board");
                return;
            }

            gameBoard.getRobot().setX(newX);
            gameBoard.getRobot().setY(newY);
            gameBoard.getRobot().setDirection(direction);
            System.out.println("Toy's position set to " + gameBoard.getRobot().getX() + "," + gameBoard.getRobot().getY() + " facing towards " + direction + " direction");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Coordinates provided in PLACE are not valid. Please provide valid coordinates to Place the toy");
        }
    }

    @Override
    public boolean validate(String cmd) {
        return cmd.startsWith(String.valueOf(CommandKeyword.PLACE));
    }
}
