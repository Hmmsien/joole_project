package com.itlize.Service;

import com.itlize.Entity.User;

import java.util.List;


public interface UserService {

    // save operation
    User saveUser(User user);

    // read operation
    List<User> getAllUser();

    // update operation
    User updateUser(User user, int userId);

    // delete operation
    void deleteUserById(int userId);

}
