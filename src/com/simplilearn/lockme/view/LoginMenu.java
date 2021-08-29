package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.model.UserMessage;
import com.simplilearn.lockme.service.LoginService;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/22/2021 - 10:47 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class LoginMenu implements Menu {
    private final String menuName = "Login Menu";
    private final User user;

    public LoginMenu(User user) {
        this.user = user;
    }

    @Override
    public void show() {
        Header header = new Header(menuName, user);
        header.show();

        System.out.print("Enter Username: ");
        user.setLoginName(Utility.getInput());
        System.out.print("Enter Password: ");
        user.setPasswd(Utility.getInput());

        LoginService loginService = new LoginService(user);
        if (loginService.authenticate()) {
            user.setLoggedIn(true);
        } else {
            UserMessage.setUserMessage("Incorrect username or password");
        }

    }
}
