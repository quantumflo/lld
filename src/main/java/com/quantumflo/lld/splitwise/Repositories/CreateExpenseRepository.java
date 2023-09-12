package com.quantumflo.lld.splitwise.Repositories;

import com.quantumflo.lld.splitwise.Models.Expense;

import java.util.ArrayList;
import java.util.List;

public class CreateExpenseRepository {
    private List<Expense> expenses = new ArrayList<>();

    public Expense save(Expense expense) {
        expenses.add(expense);
        return expense;
    }


}
