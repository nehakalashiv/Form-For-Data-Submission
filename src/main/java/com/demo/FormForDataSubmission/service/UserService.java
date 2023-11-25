package com.demo.FormForDataSubmission.service;

import com.demo.FormForDataSubmission.entity.User;
import com.demo.FormForDataSubmission.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }


    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
