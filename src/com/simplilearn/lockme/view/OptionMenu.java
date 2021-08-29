package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.model.UserMessage;
import com.simplilearn.lockme.service.CredentialService;
import com.simplilearn.lockme.service.Utility;

/**
 * Created: 08/22/2021 - 10:36 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class OptionMenu implements Menu {
    private final String menuName = "Option Menu";
    private final User user;

    public OptionMenu(User user) {
        this.user = user;
    }

    @Override
    public void show() {
        Header header = new Header(menuName, user);
        header.show();
        System.out.printf("%s%n", "1. List All Credentials");
        System.out.printf("%s%n", "2. Search Credentials");
        System.out.printf("%s%n", "3. Add Credential");
        System.out.printf("%s%n", "4. Delete Credential");
        System.out.printf("%s%n%n", "5. Logout");
        System.out.print("Enter Choice: ");

        // TODO: add a try-catch here if user enteres something other than a number.
        // TODO: add logic here
        switch (Integer.parseInt(Utility.getInput())) {
            case 1:
                ListCredentialsMenu listMenu = new ListCredentialsMenu(user);
                listMenu.show();
                break;
            case 2:
                System.out.println("Searching Creds");
                break;
            case 3:
                AddCredentialMenu addMenu = new AddCredentialMenu(user);
                addMenu.show();
                break;
            case 4:
                System.out.println("deleting cred");
                break;
            case 5:
                user.setLoggedIn(false);
                break;
            default:
                UserMessage.setUserMessage("Invalid Choice");
        }

    }
}
