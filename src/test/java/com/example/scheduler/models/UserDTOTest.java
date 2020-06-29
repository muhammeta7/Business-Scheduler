package com.example.scheduler.models;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserDTOTest {
    private UserDTO user;

    @Before
    public void setup(){
        this.user = new UserDTO();
    }

    @Test
    public void getAndSetUsernameTest(){
        String expected = "testUser";
        user.setUsername(expected);
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    public void getAndSetPasswordTest(){
        String expected = "testPassword";
        user.setUsername(expected);
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }
}
