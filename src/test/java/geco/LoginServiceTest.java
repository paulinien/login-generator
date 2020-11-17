package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService loginsExistants;
    private String[] loginsString;

    @Before
    public void setUp() throws Exception {
        loginsString = new String[4];
        for(int i=0; i<loginsString.length; i++){
            loginsString[i] = "login"+i;
        }
        loginsExistants = new LoginService(loginsString);
    }

    @Test
    public void loginExists() {
        assertTrue(loginsExistants.loginExists("login1"));
        assertFalse(loginsExistants.loginExists("login5"));
    }

    @Test
    public void addLogin() {
        loginsExistants.addLogin("login18");
        assertTrue(loginsExistants.loginExists("login18"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        List<String> listRes = new ArrayList<>();
        listRes.add("login1");
        assertEquals(listRes, loginsExistants.findAllLoginsStartingWith("login1"));
    }

    @Test
    public void findAllLogins() {
        List<String> listRes = new ArrayList<>(Arrays.asList(loginsString));
        Collections.sort(listRes);
        assertEquals(listRes, loginsExistants.findAllLogins());
    }
}