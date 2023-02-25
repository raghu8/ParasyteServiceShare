package com.parasyte.serviceshare.model;

import javax.persistence.*;

@Entity
@Table(name = "expenses_users")
public class ExpenseUser {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private Expense expense;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
