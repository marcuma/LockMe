package com.simplilearn.lockme.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created: 08/22/2021 - 12:38 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class User implements Serializable {

    private String userName;
    private String loginName;
    private String passwd;
    private boolean loggedIn = false;

    public User() {
    }

    public User(String userName, String loginName, String passwd) {
        this.userName = userName;
        this.loginName = loginName;
        this.passwd = passwd;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return loggedIn == user.loggedIn && Objects.equals(userName, user.userName) && Objects.equals(loginName, user.loginName) && Objects.equals(passwd, user.passwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, loginName, passwd, loggedIn);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passwd='" + passwd + '\'' +
                ", loggedIn=" + loggedIn +
                '}';
    }
}
