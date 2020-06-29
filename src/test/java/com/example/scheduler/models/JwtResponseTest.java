package com.example.scheduler.models;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JwtResponseTest{
    private JwtResponse jwtResponse;
    private final String jwtToken = "token";

    @Before
    public void setup(){
        this.jwtResponse = new JwtResponse(jwtToken);
    }

    @Test
    public void constructorTest(){
        String expected = "token";
        String actual = jwtResponse.getToken();
        assertEquals(expected, actual);
    }
}
