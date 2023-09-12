package com.quantumflo.lld.splitwise.services;

import com.quantumflo.lld.splitwise.Models.Expense;
import com.quantumflo.lld.splitwise.Models.User;
import com.quantumflo.lld.splitwise.Models.UserExpense;
import com.quantumflo.lld.splitwise.Repositories.CreateExpenseRepository;
import com.quantumflo.lld.splitwise.controller.RequestExpenseDto;

import java.util.List;

public class CreateExpenseService {
    private CreateExpenseRepository createExpenseRepository = new CreateExpenseRepository();

    public Expense createExpense(RequestExpenseDto dto) {
        Expense expense = new Expense();
        List<UserExpense> eu = dto.getUsers();
        User user = dto.getCreatedby();
        Double total = dto.totalAmount;

        if(dto.getIsEqualExpense()) {
            UserExpense ue = new UserExpense();
        }

        return createExpenseRepository.save(expense);
    }
}
