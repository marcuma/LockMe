package com.simplilearn.lockme.service;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.repository.UserRepositoryImpl;

import java.util.HashSet;

/**
 * Created: 08/28/2021 - 11:59 AM
 * Project: LockMe
 *
 * @author marcuma
 */
public class RegistrationService {
    final private User user;
    final private HashSet<User> users;


    public RegistrationService(User user) {
        this.user = user;
        users = new HashSet<User>();

    }

    public void save() {
        users.add(user);
        UserRepositoryImpl repo = new UserRepositoryImpl(users);
        repo.save();
    }

}
