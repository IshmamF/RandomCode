package emaillApp;

import java.util.Scanner;

public class email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor for first and last name
    public email() {
        System.out.print("State first name: ");
        Scanner in = new Scanner(System.in);
        this.firstName = in.next();

        System.out.print("State last name: ");
        Scanner input = new Scanner(System.in);
        this.lastName = input.next();

        System.out.println("Name Set: " + this.firstName + " " + this.lastName);

        // call a method asking for department - return department
        this.department = setDepartment();
        System.out.println("Department Set: " + department);

        // call a method that generates random password
        this.password = setPassword();
        System.out.println("Your password is: " + this.password);

        // combine first and last for email
        String Email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Email created: " + Email);
    }

    public email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Name Set: " + this.firstName + " " + this.lastName);

        // call a method asking for department - return department
        this.department = setDepartment();
        System.out.println("Department Set: " + department);

        // call a method that generates random password
        this.password = setPassword();
        System.out.println("Your password is: " + this.password);

        // combine first and last for email
        String Email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Email created: " + Email);
    }

    // ask for department
    private String setDepartment() {
        System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "None";
        }
    }

    // generate random password
    private String setPassword() {
        String passChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        System.out.print("Input password length: ");
        Scanner in = new Scanner(System.in);
        int Length = in.nextInt();
        char[] password = new char[Length];
        for (int i = 0; i < Length; i++) {
            int random = (int) (Math.random() * passChar.length());
            password[i] = passChar.charAt(random);
        }
        return new String(password);
    }

    // set mailbox capacity
    public void setMailboxCapacity(int input) {
        this.mailboxCapacity = input;
    }

    // set alternate email
    public void setAlternateEmail(String input) {
        this.alternateEmail = input;
    }

    // change the password
    public void changePass(String pass) {
        this.password = pass;
    }

}
