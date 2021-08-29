package com.simplilearn.lockme.repository;

import com.simplilearn.lockme.model.Credential;

import java.util.HashSet;

/**
 * Created: 08/29/2021 - 12:43 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class CredentialRepositoryImpl extends Repository {

    public CredentialRepositoryImpl(String fileName,  HashSet<Credential> credentials) {
        super(credentials);
        super.file = fileName;
    }
}
