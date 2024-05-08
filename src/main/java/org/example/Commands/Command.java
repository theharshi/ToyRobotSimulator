package org.example.Commands;

import org.example.GameBoard;

public interface Command {

    void execute(String input, GameBoard gameBoard);

    // validate
    boolean validate(String input);
}
