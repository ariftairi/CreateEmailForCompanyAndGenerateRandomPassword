package Day03;

import java.util.Random;
import java.util.Scanner;

public class Mail {

    private String firstname;
    private String lastname;
    private String department;
    private String password;
    private String email;
    private int passwordLength = 8;
    private String suffix = "company.com";

    public Mail(String firstname, String lastname) {


        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email created: " + this.firstname + " " + this.lastname);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = randomPassword(passwordLength);
        System.out.println("Your password is: " + this.password);
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@"
                + department + "." + suffix;
        System.out.println("Your email is: " + email);
    }

    public String setDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Departments: \n1 for Sales, \n2 for Development, \n3 for Accounting, \n0 for none");

        int nr = sc.nextInt();

        if (nr == 1) {
            return "sales";
        } else if (nr == 2) {
            return "development";
        } else if (nr == 3) {
            return "accounting";
        } else {
            return "none";
        }

    }

    public String randomPassword(int length) {
        String passwrodSet = "abcdefghijklmnopkrstuvwxyz0123456789!@#$%^&*1'";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwrodSet.length());
            password[i] = passwrodSet.charAt(random);
        }
        return new String(password);
    }

    public String info() {
        return "Show data for: " + firstname + " " + lastname + ", Company Email: " + email;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


