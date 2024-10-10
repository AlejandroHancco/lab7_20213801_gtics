package com.example.lab7.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "movieprojections")
public class MovieProjections {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movieId;
    @ManyToOne
    @JoinColumn(name = "roomId")
    private Room roomId;
    @Column(name = "projectionDate")
    private String projectionDate;
    @Column(name = "availableSeats")
    private Integer availableSeats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Movie getMovieId() {
        return movieId;
    }

    public void setMovieId(Movie movieId) {
        this.movieId = movieId;
    }

    public Room getRoomId() {
        return roomId;
    }

    public void setRoomId(Room roomId) {
        this.roomId = roomId;
    }

    public String getProjectionDate() {
        return projectionDate;
    }

    public void setProjectionDate(String projectionDate) {
        this.projectionDate = projectionDate;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }
}