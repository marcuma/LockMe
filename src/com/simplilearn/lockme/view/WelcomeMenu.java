package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/22/2021 - 9:49 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class WelcomeMenu {
    private final String menuName = "Welcome Menu";
    private String userMessage = "";
    private User user;

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    private boolean exit = false;


    public WelcomeMenu(String userMessage, User user) {
        this.userMessage = userMessage;
        this.user = user;
    }

    public void show() {
        Header header = new Header(menuName, userMessage, user);
        header.show();
        System.out.printf("%s%n", "1. Register");
        System.out.printf("%s%n", "2. Login");
        System.out.printf("%s%n%n", "3. Exit");
        System.out.print("Enter Choice: ");

        switch (Integer.parseInt(Utility.getInput())) {
            case 1:
                RegistrationMenu reg = new RegistrationMenu(userMessage, user);
                reg.show();
                break;
            case 2:
                Menu login = new LoginMenu(userMessage, user);
                login.show();
                break;
            case 3:
                setExit(true);
                break;
            default:
                userMessage = "Invalid Choice";
        }
    }
}
