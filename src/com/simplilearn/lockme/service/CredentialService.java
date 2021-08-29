package com.simplilearn.lockme.service;

import com.simplilearn.lockme.model.Credential;
import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.repository.CredentialRepositoryImpl;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.HashSet;

/**
 * Created: 08/29/2021 - 12:54 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class CredentialService {
    private final Credential credential;
    private final User USER;
    private final String FILENAME;
    private  HashSet<Credential> locker;


    public CredentialService(User user, Credential credential) {
        this.credential = credential;
        this.USER = user;
        this.FILENAME = user.getLoginName() + ".db";
        locker = new HashSet<Credential>();
    }

    public void save() {
        CredentialRepositoryImpl repo = new CredentialRepositoryImpl(FILENAME, locker);
        locker = (HashSet<Credential>) repo.getObject();
        locker.add(this.credential);
        repo.save();
    }
}
