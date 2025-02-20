package com.example.DecolaAPI.Service.Impl;

import com.example.DecolaAPI.Domain.Model.User;
import com.example.DecolaAPI.Domain.Repository.UserRepository;
import com.example.DecolaAPI.Service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserServiceInterface {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(User user) {

        if(userRepository.existsByAccount_Number(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(user);
    }
}
