package com.quantumflo.lld.pen.models;

import com.quantumflo.lld.pen.Interfaces.RefillPen;
import com.quantumflo.lld.pen.Strategies.WritingStrategy;
import lombok.AllArgsConstructor;
import lombok.Setter;

public class BallPen extends Pen implements RefillPen {
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
