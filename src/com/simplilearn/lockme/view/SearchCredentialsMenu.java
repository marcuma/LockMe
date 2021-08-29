package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.Credential;
import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.model.UserMessage;
import com.simplilearn.lockme.service.CredentialService;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/29/2021 - 2:33 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class SearchCredentialsMenu implements Menu {
    private final String menuName = "Search Credential Menu";
    private final User user;

    public SearchCredentialsMenu(User user) {
        this.user = user;
    }

    @Override
    public void show() {
        UserMessage.setUserMessage("");
        Header header = new Header(menuName, user);
        header.show();

        System.out.print("Enter sitename to search for: ");
        String siteName = Utility.getInput();

        CredentialService credSrv = new CredentialService(user);
        Credential cred = credSrv.searchLocker(siteName);
        if (cred != null) {
            System.out.println("Sitename: " + cred.getSiteName());
            System.out.println("Username: " + cred.getUserName());
            System.out.println("Password: " + cred.getPassword());
            System.out.println();
            System.out.println("Press any key to continue.");
            Utility.getInput();
            UserMessage.setUserMessage("");
        }

    }
}
