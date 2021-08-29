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
public class DeleteCredentialsMenu implements Menu {
    private final String menuName = "Delete Credential Menu";
    private final User user;

    public DeleteCredentialsMenu(User user) {
        this.user = user;
    }

    @Override
    public void show() {
        UserMessage.setUserMessage("");
        Header header = new Header(menuName, user);
        header.show();

        System.out.print("Enter sitename to delete: ");
        String siteName = Utility.getInput();

        CredentialService credSrv = new CredentialService(user);
        Credential cred = credSrv.searchLocker(siteName);
        credSrv.delete(siteName);



    }
}
