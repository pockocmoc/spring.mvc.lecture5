package com.pockocmoc.spring.mvc.lecture5.service;

import com.pockocmoc.spring.mvc.lecture5.model.User;
import com.pockocmoc.spring.mvc.lecture5.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers() {
        userRepository.save(new User(null, "Marat", "pockocmoc@inbox.ru"));

        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

}
