package com.quantumflo.lld.pen.models;

import com.quantumflo.lld.pen.Interfaces.RefillPen;
import com.quantumflo.lld.pen.Strategies.WritingStrategy;

public class GelPen extends Pen implements RefillPen {
    private Refill refill;
    private WritingStrategy ws;

    @Override
    public void write() {
        ws.write();
    }

    @Override
    public void refill() {
        System.out.println("changing refill");
    }
}
