package com.example.scheduler.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class DAOUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Name can not be empty!")
    @Size(min=3, max=30)
    private String name;
    @Email(message = "Email should be valid!")
    private String email;
    @NotEmpty(message = "Username can not be empty!")
    @Size(min=3, max=30)
    private String username;
    @JsonIgnore
    @NotEmpty(message = "passsword can not be empty!")
    @Size(min=7, max=30)
    private String password;
    @OneToMany
    private Set<Appointment> hosted;
    @ManyToMany
    private Set<Guest> attended;

    public DAOUser(){
    };

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Appointment> getHosted() {
        return hosted;
    }

    public void setHosted(Set<Appointment> hosted) {
        this.hosted = hosted;
    }

    public Set<Guest> getAttended() {
        return attended;
    }

    public void setAttended(Set<Guest> attended) {
        this.attended = attended;
    }
}
