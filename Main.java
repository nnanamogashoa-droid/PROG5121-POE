/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Student
 */
import java.util.Scanner;

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

class Login {
    User registeredUser;
    Scanner scanner;

    public Login(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean checkUsername(String username) {
        if (username.length() == 5 && username.contains("_")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPassword(String password) {
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            } else if (c >= '0' && c <= '9') {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        if (password.length() >= 8 && hasUpper && hasNumber && hasSpecial) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCell(String cell) {
        if (cell.startsWith("+27") && cell.length() == 12) {
            boolean valid = true;

            for (int i = 3; i < cell.length(); i++) {
                if (!Character.isDigit(cell.charAt(i))) {
                    valid = false;
                }
            }

            return valid;
        } else {
            return false;
        }
    }

    public void register() {
        System.out.println("\n--- REGISTER ---");

        // First Name
        String fName;
        while (true) {
            System.out.print("Enter first name: ");
            fName = scanner.nextLine();

            if (fName.length() >= 2) {
                break;
            } else {
                System.out.println("First name must be at least 2 characters.");
            }
        }

        // Last Name
        String lName;
        while (true) {
            System.out.print("Enter last name: ");
            lName = scanner.nextLine();

            if (lName.length() >= 2) {
                break;
            } else {
                System.out.println("Last name must be at least 2 characters.");
            }
        }

        // Username
        String username;
        while (true) {
            System.out.print("Enter username (5 chars, must include _): ");
            username = scanner.nextLine();

            if (checkUsername(username)) {
                break;
            } else {
                System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
            }
        }

        // Password
        String password;
        while (true) {
            System.out.print("Enter password (8+ chars, uppercase, number, special char): ");
            password = scanner.nextLine();

            if (checkPassword(password)) {
                break;
            } else {
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least 8 characters, a capital letter,a number, and a special character.");
            }
        }

        // Cell Number
        String cell;
        while (true) {
            System.out.print("Enter cell number (+27): ");
            cell = scanner.nextLine();

            if (checkCell(cell)) {
                break;
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }
        }

        registeredUser = new User(fName, lName, username, password, cell);
        System.out.println("Registration successful!");
    }

    public void login() {
        if (registeredUser == null) {
            System.out.println("No user registered.");
            return;
        }

        System.out.println("\n--- LOGIN ---");

        while (true) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (registeredUser.username.equals(username) && registeredUser.password.equals(password)) {
                System.out.println("Welcome " + registeredUser.fName + " " + registeredUser.lName + " it is great to see you again.");
                break;
            } else {
                System.out.println("Username or password incorrect, please try again.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login system = new Login(scanner);

        system.register();
        system.login();

        scanner.close();
    }
}
