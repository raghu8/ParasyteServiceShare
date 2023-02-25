package com.parasyte.serviceshare.dao;

import com.parasyte.serviceshare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ExpenseRepository extends JpaRepository<User, Long> {

    @Modifying
    @Query("INSERT INTO expense_users(description, amount, date, paid_by_id, group_id) VALUES (:description, :amount, :date, :paid_by_id, :group_id)")
    void createUser(@Param("name") String name, @Param("email") String email, @Param("password") String password);
}
