package com.quantumflo.lld.pen.models;

import com.quantumflo.lld.pen.Strategies.WritingStrategy;

public class FountainPen extends Pen {
    private Refill refill;
    private Ink ink;
    private WritingStrategy ws;

    public void write() {
        ws.write();
    }
}
