package com.simplilearn.lockme.repository;

import com.simplilearn.lockme.model.User;

import java.util.HashSet;

/**
 * Created: 08/28/2021 - 2:06 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class UserRepositoryImpl extends Repository {
    private String fileName = "users.db";

    public UserRepositoryImpl(HashSet<User> users) {
        super(users);
        super.file = fileName;
    }

    public UserRepositoryImpl() {
        super();
        super.file = fileName;
    }


}
