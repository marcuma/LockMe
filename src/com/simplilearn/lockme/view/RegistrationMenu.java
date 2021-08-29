package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.service.RegistrationService;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/22/2021 - 9:34 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class RegistrationMenu implements Menu {
    private final String menuName = "Registration";
    private final User user;

    public RegistrationMenu(User user) {
        this. user = user;
    }

    @Override
    public void show() {
        Header header = new Header(menuName, user);
        header.show();

        System.out.print("Enter Full Name: ");
        user.setUserName(Utility.getInput());
        System.out.print("Enter Username: ");
        user.setLoginName(Utility.getInput());
        System.out.print("Enter Password: ");
        user.setPasswd(Utility.getInput());

        RegistrationService regSrv = new RegistrationService(user);
        regSrv.save();

    }
}
