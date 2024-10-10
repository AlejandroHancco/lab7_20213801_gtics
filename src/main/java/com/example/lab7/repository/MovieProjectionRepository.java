package com.example.lab7.repository;


import com.example.lab7.entity.MovieProjections;
import com.example.lab7.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieProjectionRepository extends JpaRepository<MovieProjections, Integer> {

}
