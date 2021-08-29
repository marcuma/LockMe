package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.Credential;
import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.model.UserMessage;
import com.simplilearn.lockme.service.CredentialService;
import com.simplilearn.lockme.service.LoginService;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/22/2021 - 10:47 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class AddCredentialMenu implements Menu {
    private final String menuName = "Add Credential Menu";
    private final User user;
    private final Credential credential;

    public AddCredentialMenu(User user) {
        this.user = user;
        credential = new Credential();
    }

    @Override
    public void show() {
        Header header = new Header(menuName, user);
        header.show();

        System.out.print("Enter Sitename:");
        credential.setSiteName(Utility.getInput());
        System.out.print("Enter Username: ");
        credential.setUserName(Utility.getInput());
        System.out.print("Enter Password: ");
        credential.setPassword(Utility.getInput());

        CredentialService credService = new CredentialService(user, credential);
        credService.save();

    }
}
