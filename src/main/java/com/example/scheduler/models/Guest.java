package com.example.scheduler.models;

import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "guest_id")
    private Long id;
    @ManyToOne
    private DAOUser user;
    @ManyToOne
    private Appointment event;
    private Boolean attending;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DAOUser getUser() {
        return user;
    }

    public void setUser(DAOUser user) {
        this.user = user;
    }

    public Appointment getEvent() {
        return event;
    }

    public void setEvent(Appointment event) {
        this.event = event;
    }

    public Boolean getAttending() {
        return attending;
    }

    public void setAttending(Boolean attending) {
        attending = attending;
    }

}
