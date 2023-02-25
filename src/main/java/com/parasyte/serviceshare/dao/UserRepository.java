package com.parasyte.serviceshare.dao;

import com.parasyte.serviceshare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.name = ?1")
    User findUserByName(String name);

    @Query("SELECT u FROM User u WHERE u.id = ?")
    User findUserById(int id);

    @Modifying
    @Query("INSERT INTO User(name, email, password) VALUES (:name, :email, password)")
    void createUser(@Param("name") String name, @Param("email") String email, @Param("password") String password);
}
