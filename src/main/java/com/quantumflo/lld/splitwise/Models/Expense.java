package com.quantumflo.lld.splitwise.Models;

import java.util.List;

public class Expense {
    private String description;
    private double amount;
    private UserExpense paidBy;
    private List<UserExpense> owedBy;
    private Status status;

    private int createdAt;

    private User createdBy;

}
