package com.demo.FormForDataSubmission.service;

import com.demo.FormForDataSubmission.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User addUser(User user);
    User getUserById(int id);
    User updateUser(User user);
}
