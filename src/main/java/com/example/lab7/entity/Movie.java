package com.example.lab7.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;


@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", length = 100)
    @Size(max=100, message = "El nombre no puede tener más de 100 caracteres")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "duration")
    private Integer duration;

    @Column(name = "releaseDate")
    private String releaseDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}