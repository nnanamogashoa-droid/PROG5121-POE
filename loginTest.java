/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class loginTest {
    
    public loginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "chel_";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);

        
    }

    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "Dineo13$";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);

        
    }

    /**
     * Test of checkCell method, of class Login.
     */
    @Test
    public void testCheckCell() {
        System.out.println("checkCell");
        String number = "+27671043822";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkCell(number);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of register method, of class Login.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        String username = "chel_";
        String password = "Dineo13$";
        String cellnumber = "+27671043822";
        Login instance = null;
        String expResult = "Registered";
        instance.register();
        
    }

    /**
     * Test of login method, of class Login.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String usernamme="chel_";
        String password = "Dineo13$";
        Login instance = null;
        instance.login();
        
        
    }
    
}
