package com.simplilearn.lockme.service;

import com.simplilearn.lockme.model.User;
import com.simplilearn.lockme.repository.Repository;
import com.simplilearn.lockme.repository.UserRepositoryImpl;

import java.util.HashSet;

/**
 * Created: 08/28/2021 - 4:41 PM
 * Project: LockMe
 *
 * @author marcuma
 */
public class LoginService {
    private User user;
    private Repository repo;
    HashSet<User> users;

    public LoginService(User user) {
        this.user = user;
        users = new HashSet<User>();
        repo = new UserRepositoryImpl();
        users = (HashSet<User>) repo.getObject();

    }

    public boolean authenticate() {
        // search for user in hash
      for (User user : users) {
          String inputUser = this.user.getLoginName();
          String inputPassword = this.user.getPasswd();

          if (inputUser.equals(user.getLoginName()) &&
              inputPassword.equals(user.getPasswd())) {

              this.user.setUserName(user.getUserName());
              return true;
          }
      }
        return false;
    }


}
