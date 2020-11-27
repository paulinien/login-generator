package geco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator loginGenerator;
    private LoginService loginService;
    private String[] loginsString = {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"};

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(loginsString);
        loginGenerator = new LoginGenerator(loginService);
    }

    @After
    public void tearDown() throws Exception {
        loginService = null;
        loginGenerator = null;
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        //CT
        assertEquals("PDU", loginGenerator.generateLoginForNomAndPrenom("Du", "Paul"));
    }

    @Test
    public void generateLoginForNomAndPrenom1() {
        //CT1
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
    }

    @Test
    public void generateLoginForNomAndPrenom2() {
        //CT2
        assertEquals("JRAL2", loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    @Test
    public void generateLoginForNomAndPrenom3() {
        //CT3
        assertEquals("JROL1", loginGenerator.generateLoginForNomAndPrenom("Rolling", "John"));
    }

    @Test
    public void generateLoginForNomAndPrenom4() {
        //CT4
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul"));
    }
}