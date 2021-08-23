package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.User;

/**
 * Created: 08/22/2021 - 9:21 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class Header implements Menu {
    private final String appName = "LockMe.com";
    private final String developer = "Mark Marcum";
    private final String line = "**************************************************%n";
    private final String menuName;
    private final String userMessage;
    private final User user;

    public Header(String menuName, String userMessage, User user) {
        this.menuName = menuName;
        this.userMessage = userMessage;
        this.user = user;
    }

    public void show() {
        System.out.printf(line);
        System.out.printf("                      %s                        %n", appName);
        System.out.printf("                 Developer: %s                        %n", developer);
        System.out.printf("                      %s                        %n", menuName);
        if(user.isLoggedIn())
            System.out.printf("               %s's Locker                        %n", user.getUserName());
        System.out.printf(line);
        System.out.printf("%s                                               %n%n", userMessage);

    }
}
