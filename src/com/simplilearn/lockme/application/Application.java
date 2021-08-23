package com.simplilearn.lockme.application;


import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.service.Utility;
import com.simplilearn.lockme.view.*;

import java.util.Scanner;

/**
 * Created: 08/22/2021 - 5:54 PM
 * Project: LockMe
 *
 * @author marcuma
 */

public class Application {

    public static void main(String[] args) {
        User user = new User();
        String userMessage = "";
        String menuName = "Welcome Menu";
        WelcomeMenu welcomeView = new WelcomeMenu(userMessage, user);
        Menu optionView = new OptionMenu(userMessage, user);

        while (!welcomeView.isExit()) {
            if (user.isLoggedIn()) {
                optionView.show();
            } else {
               welcomeView.show();
            }
        }
    }
}

