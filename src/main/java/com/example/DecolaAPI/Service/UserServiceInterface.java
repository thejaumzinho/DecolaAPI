package com.example.DecolaAPI.Service;

import com.example.DecolaAPI.Domain.Model.User;

public interface UserServiceInterface {

    User findById(long id);
    User createUser(User user);

}
