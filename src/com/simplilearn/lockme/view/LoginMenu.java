package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/22/2021 - 10:47 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class LoginMenu implements Menu {
    private final String menuName = "Login Menu";
    private String userMessage;
    private final User user;

    public LoginMenu(String userMessage, User user) {
        this.userMessage = userMessage;
        this.user = user;
    }

    @Override
    public void show() {
        Header header = new Header(menuName, userMessage, user);
        header.show();

        //TODO: read from user files and verify credentials are correct.
        System.out.print("Enter Username: ");
        user.setLoginName(Utility.getInput());
        System.out.print("Enter Password: ");
        user.setPasswd(Utility.getInput());

        user.setLoggedIn(true);

    }
}
