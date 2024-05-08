package org.example.Commands;

import org.example.GameBoard;
import org.example.Robot;

public class ReportCommand implements Command {

    @Override
    public void execute(String input, GameBoard gameBoard) {
        System.out.println("Executing Report Command------");
        if(gameBoard.getRobot().getX() == -1 ||  gameBoard.getRobot().getY() == -1){
            System.out.println("Toy's position has not been set. please place robot on the board first");
            return;
        }
        System.out.println("Toy is placed at " + gameBoard.getRobot().getX() + "," + gameBoard.getRobot().getY() + " coordinates facing towards " + gameBoard.getRobot().getDirection() + " direction");
    }

    @Override
    public boolean validate(String input) {
        return input.trim().equals(String.valueOf(CommandKeyword.REPORT));
    }
}
