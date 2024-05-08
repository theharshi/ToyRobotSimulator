package org.example;

public class GameBoard {
    private final int rowLen,colLen;
    private Robot robot;

    public GameBoard(int rowLen,int colLen, Robot robot){
        this.colLen = colLen;
        this.rowLen = rowLen;
        this.robot = robot;
    }

    public int getRowLen() {
        return rowLen;
    }

    public int getColLen() {
        return colLen;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}
