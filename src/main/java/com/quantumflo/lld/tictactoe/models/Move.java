package com.quantumflo.lld.tictactoe.models;
import lombok.Getter;
import lombok.Setter;

public class Move {
    int row;
    int col;

    public void setRow(int row ) {
        this.row = row;
    }

    public void setCol(int col ) {
        this.col = col;
    }
}
