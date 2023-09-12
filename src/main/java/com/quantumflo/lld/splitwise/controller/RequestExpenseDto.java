package com.quantumflo.lld.splitwise.controller;

import com.quantumflo.lld.splitwise.Models.User;
import com.quantumflo.lld.splitwise.Models.UserExpense;

import java.util.List;

public class RequestExpenseDto {
    User createdBy;
    public double totalAmount;
    List<UserExpense> users;
    private boolean isEqualSplit;

    public List<UserExpense> getUsers() {
        return users;
    }

    public boolean getIsEqualExpense() {
        return isEqualSplit;
    }



    public User getCreatedby() {
        return createdBy;
    }
}
