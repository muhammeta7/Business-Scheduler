package com.example.scheduler.models;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class AppointmentTest {

    private Appointment appointment;

    @Before
    public void setup(){
        this.appointment = new Appointment();
    }

    @Test
    public void constructorTest(){
        assertNotNull(appointment);
    }

    @Test
    public void getAndSetIdTest(){
        appointment.setId(1l);
        long expected = 1l;
        long actual = appointment.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetTitleTest(){
        appointment.setTitle("sporting event");
        String expected = "sporting event";
        String actual = appointment.getTitle();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetDescription(){
        appointment.setDescription("Basketball Game");
        String expected = "Basketball Game";
        String actual = appointment.getDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetStartTest(){
        LocalDate expected = LocalDate.now();
        appointment.setStart(expected);
        LocalDate actual = appointment.getStart();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetEndTest(){
        LocalDate expected = LocalDate.now();
        appointment.setEnd(expected);
        LocalDate actual = appointment.getEnd();
        assertEquals(expected, actual);
    }
}
