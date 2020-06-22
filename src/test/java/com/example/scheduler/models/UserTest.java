package com.example.scheduler.models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    private User user;

    @Before
    public void setup(){
        this.user = new User();
    }

    @Test
    public void getAndSetIdTest(){
        user.setId(1l);
        long expected = 1l;
        long actual = user.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetNameTest(){
        user.setName("Moe Aydin");
        String expected = "Moe Aydin";
        String actual = user.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetEmailTest(){
        user.setEmail("moe@email.com");
        String expected = "moe@email.com";
        String actual = user.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetUsernameTest(){
        user.setUsername("username12");
        String expected = "username12";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetPasswordTest(){
        user.setPassword("password");
        String expected = "password";
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }
}
