package com.quantumflo.lld.tictactoe.models;

import com.quantumflo.lld.tictactoe.enums.PlayerType;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private PlayerType playerType;

    public Move makeMove(Board board, int x, int y) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell row number (Starting from 0)");
        int row = scanner.nextInt();

        System.out.printf("Please tell column number (Starting from 0)");
        int col = scanner.nextInt();

        Move move = new Move();
        move.setCol(col);
        move.setRow(row);

        return move;
    }
}
