package org.example;

import org.example.Commands.CommandExecuter;

public class ToyRobotSimulator {

    GameBoard gameBoard;
    CommandExecuter commandExecuter;

    public ToyRobotSimulator(){
        Robot robot = new Robot();
        gameBoard = new GameBoard(5,5,robot);
        commandExecuter = new CommandExecuter();
    }


    public void runCommand(String cmd){
        commandExecuter.execute(cmd,gameBoard);
    }

}
