package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.Credential;
import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.service.CredentialService;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/29/2021 - 2:04 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class ListCredentialsMenu implements Menu {

    private final String menuName = "List Credentials Menu";
    private final User user;

    public ListCredentialsMenu(User user) {
        this.user = user;
    }

    @Override
    public void show() {
        Header header = new Header(menuName, user);
        header.show();

        CredentialService credSrv = new CredentialService(user);
        for (Credential cred : credSrv.list()) {
            System.out.println("Site: " + cred.getSiteName());
            System.out.println("Username: " + cred.getUserName());
            System.out.println("Password: " + cred.getPassword());
            System.out.println();
        }

        System.out.println("Press any key to continue");
        Utility.getInput();

    }
}
