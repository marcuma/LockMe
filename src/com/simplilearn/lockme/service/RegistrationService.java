package com.simplilearn.lockme.service;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.repository.UserRepositoryImpl;

import java.io.FileNotFoundException;
import java.util.HashSet;

/**
 * Created: 08/28/2021 - 11:59 AM
 * Project: LockMe
 *
 * @author marcuma
 */
public class RegistrationService {
    private final User user;
    private HashSet<User> users;


    public RegistrationService(User user) {
        this.user = user;
        users = new HashSet<User>();
        users.add(user);

    }

    public void save() {
        /*
            I am constructing a single elements hash set with the user to be
            registered and creating a repo with it. Then, I get the db from the
            file. The reason I'm doing this is incase a file has not already been
            created in the getObject method, but if the file is already present, then
            I get the db, add the user, and append the file. This was all to keep from creating
            duplicate code.
         */
        UserRepositoryImpl repo = new UserRepositoryImpl(users);
        users = (HashSet<User>) repo.getObject();
        users.add(user);
        repo.save();
    }

}
