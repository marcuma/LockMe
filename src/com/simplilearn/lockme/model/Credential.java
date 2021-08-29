package com.simplilearn.lockme.model;

import java.io.Serializable;

/**
 * Created: 08/29/2021 - 12:40 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class Credential implements Serializable {
    private String siteName;
    private String userName;
    private String password;

    public Credential() {}

    public Credential(String siteName, String userName, String password) {
        this.siteName = siteName;
        this.userName = userName;
        this.password = password;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
