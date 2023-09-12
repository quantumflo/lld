package com.quantumflo.lld.splitwise.controller;

import com.quantumflo.lld.splitwise.Models.Expense;
import com.quantumflo.lld.splitwise.services.CreateExpenseService;

public class createExpenseController {

    private CreateExpenseService createExpenseService = new CreateExpenseService();


    public Expense settleExpense(RequestExpenseDto dto) throws Exception {
        if(isValid(dto)) {
            return createExpenseService.createExpense(dto);
        }

        throw new Exception("Invalid request");
    }

    public boolean isValid(RequestExpenseDto dto) {
        return true;
    }

}
