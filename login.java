/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class login {
  

class User {
    String fName;
    String lName;
    String username;
    String password;
    String cellPhone;

    public User(String fName, String lName, String username, String password, String cellPhone) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
    }
}

public class Login {
    User registeredUser;
    Scanner scanner;
   // com.mycompany.main.Login system = new com.mycompany.main.Login(scanner);
    
    
    
    public Login(Scanner scanner) {
        this.scanner = scanner;
    }

    
}  


}
