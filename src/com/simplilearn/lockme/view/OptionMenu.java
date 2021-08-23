package com.simplilearn.lockme.view;

import com.simplilearn.lockme.model.User;
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
    private String userMessage;

    public OptionMenu(String userMessage, User user) {
        this.user = user;
        this.userMessage = userMessage;
    }

    @Override
    public void show() {
        Header header = new Header(menuName, userMessage, user);
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
                System.out.println("Listing creds");
                break;
            case 2:
                System.out.println("Searching Creds");
                break;
            case 3:
                System.out.println("adding creds");
                break;
            case 4:
                System.out.println("deleting cred");
                break;
            case 5:
                user.setLoggedIn(false);
                break;
            default:
                userMessage = "Invalid Choice";
        }

    }
}
