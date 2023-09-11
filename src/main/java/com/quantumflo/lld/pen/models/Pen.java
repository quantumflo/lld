package com.quantumflo.lld.pen.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
public abstract class Pen {
    private String name;
    private String brand;
    private double price;
    public abstract void write();
}
