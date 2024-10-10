package com.example.lab7.repository;


import com.example.lab7.entity.Room;
import com.example.lab7.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findByEmail (String email);

}
