package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.model.UserMessage;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/22/2021 - 9:49 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class WelcomeMenu {
    private final String menuName = "Welcome Menu";
    private User user;

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    private boolean exit = false;


    public WelcomeMenu(User user) {

        this.user = user;
    }

    public void show() {
        Header header = new Header(menuName, user);
        header.show();
        //clear the last error message so it doesn't show again on the next screen
        UserMessage.setUserMessage("");
        System.out.printf("%s%n", "1. Register");
        System.out.printf("%s%n", "2. Login");
        System.out.printf("%s%n%n", "3. Exit");
        System.out.print("Enter Choice: ");

        try {
            switch (Integer.parseInt(Utility.getInput())) {
                case 1:
                    RegistrationMenu reg = new RegistrationMenu(user);
                    reg.show();
                    break;
                case 2:
                    Menu login = new LoginMenu(user);
                    login.show();
                    break;
                case 3:
                    setExit(true);
                    break;
                default:
                    UserMessage.setUserMessage("Invalid Choice");
            }
        } catch (NumberFormatException ex) {
            UserMessage.setUserMessage("Invalid Input, Please chose a number between 1 and 3");
        }
    }
}
