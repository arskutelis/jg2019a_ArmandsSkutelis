package lv.jg.lesson4;

import java.util.Scanner;

public class User {
    public String login;
    public String password;
    public static int loginAttemptsLeft;
    public static boolean blocked;

    public User(String login, String password, int loginAttemptsLeft, boolean blocked) {
        this.login = login;
        this.password = password;
        User.loginAttemptsLeft = loginAttemptsLeft;
        User.blocked = blocked;
    }

    public static int setLoginAttempts() {
        return loginAttemptsLeft = loginAttemptsLeft - 1;
    }

    public static int resetLoginAttempts() {
        return loginAttemptsLeft = 3;
    }

    public static void loop() {
        User andis = new User("Andis", "1345jhh", 3, false);
        User bibo = new User("Bibo", "pappar", 3, false);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String login = input1.next();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();
        if (login.equals(andis.login) && password.equals(andis.password)
                || login.equals(bibo.login) && password.equals(bibo.password)) {
            System.out.println("Access Granted! Welcome!");
            System.out.println(".........................................");
            System.out.println("New User, Log in!");
            System.out.println(".........................................");
            resetLoginAttempts();
            loop();
        } else {
            User.setLoginAttempts();
            System.out.println("Access Not Granted! 2 login attempts left.");
            System.out.println(".........................................");
            Scanner input3 = new Scanner(System.in);
            System.out.println("Enter Username : ");
            String login1 = input3.next();
            Scanner input4 = new Scanner(System.in);
            System.out.println("Enter Password : ");
            String password1 = input4.next();
            if (User.loginAttemptsLeft > 0 && login1.equals(andis.login) && password1.equals(andis.password)
                    || bibo.loginAttemptsLeft > 0 && login1.equals(bibo.login) && password1.equals(bibo.password)) {
                System.out.println("Access Granted! Welcome!");
                System.out.println(".........................................");
                System.out.println("New User, Log in!");
                System.out.println(".........................................");
                resetLoginAttempts();
                loop();
            } else {
                User.setLoginAttempts();
                System.out.println("Access Not Granted! 1 login attempt left.");
                System.out.println(".........................................");
                Scanner input5 = new Scanner(System.in);
                System.out.println("Enter Username : ");
                String login2 = input5.next();
                Scanner input6 = new Scanner(System.in);
                System.out.println("Enter Password : ");
                String password2 = input6.next();
                if (User.loginAttemptsLeft > 0 && login2.equals(andis.login) && password2.equals(andis.password)
                        || bibo.loginAttemptsLeft > 0 && login2.equals(bibo.login) && password2.equals(bibo.password)) {
                    System.out.println("Access Granted! Welcome!");
                    System.out.println(".........................................");
                    System.out.println("New User, Log in!");
                    System.out.println(".........................................");
                    resetLoginAttempts();
                    loop();
                } else {
                    User.setLoginAttempts();
                    User.block();
                    if (User.blocked = false) {
                        System.out.println("Error!");
                    } else {
                        System.out.println(".....................................................");
                        System.out.println("Access Not Granted! Blocked! All login attempts used!");
                        System.out.println(".....................................................");
                    }
                }
            }
        }
    }

    public static boolean block() {
        if (loginAttemptsLeft == 0) {
            return blocked = true;
        } else {
            return blocked = false;
        }
    }
}

