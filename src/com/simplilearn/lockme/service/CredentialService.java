package com.simplilearn.lockme.service;

import com.simplilearn.lockme.model.Credential;
import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.model.UserMessage;
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
    private  String fileName;
    private  HashSet<Credential> locker;
    private CredentialRepositoryImpl repo;


    public CredentialService(User USER) {
        this.USER = USER;
        this.fileName = getFileName();
        credential = null;
    }

    public CredentialService(User user, Credential credential) {
        this.credential = credential;
        this.USER = user;
        this.fileName = getFileName();
        locker = new HashSet<Credential>();
    }

    // todo methodize getObject calls
    public void save() {
        repo = new CredentialRepositoryImpl(fileName, locker);
        locker = (HashSet<Credential>) repo.getObject();
        locker.add(this.credential);
        repo.save();
    }

    public HashSet<Credential> list() {
        repo = new CredentialRepositoryImpl(fileName, locker);
        locker = (HashSet<Credential>) repo.getObject();
        return locker;
    }

    public Credential searchLocker(String siteName) {
        repo = new CredentialRepositoryImpl(fileName, locker);
        locker = (HashSet<Credential>) repo.getObject();
        for (Credential cred : locker) {
            if (cred.getSiteName().toLowerCase().equals(siteName.toLowerCase())) {
                return cred;
            } else {
                UserMessage.setUserMessage("Credential not found.");
            }

        }
        return null;
    }

    private String getFileName() {
        return this.fileName = this.USER.getLoginName() + ".db";
    }
}
