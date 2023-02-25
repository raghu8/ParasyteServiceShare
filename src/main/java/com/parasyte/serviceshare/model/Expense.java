package com.parasyte.serviceshare.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "expenses_users")
public class Expense {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    private String description;
    private double amount;
    //TODO: figure out if this should be system time or input by user
    private Date date;
    private User paidBy;
    private Group group;
    private List<ExpenseUser> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<ExpenseUser> getUsers() {
        return users;
    }

    public void setUsers(List<ExpenseUser> users) {
        this.users = users;
    }
}
