package com.example.lab7.entity;

import com.example.lab7.entity.Rol;
import com.example.lab7.entity.Room;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email",nullable = false, length = 100)
    private String email;
    @Column(name = "password",nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name = "roleId")
    private Rol roleId;
    @Column(name = "name", nullable = false)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRoleId() {
        return roleId;
    }

    public void setRoleId(Rol roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
