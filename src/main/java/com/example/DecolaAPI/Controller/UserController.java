package com.example.DecolaAPI.Controller;


import com.example.DecolaAPI.Domain.Model.User;
import com.example.DecolaAPI.Service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceInterface userService;

    public UserController(UserServiceInterface userService)
    {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findByID(@PathVariable Long id)
    {
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        var createUser = userService.createUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createUser.getID())
                .toUri();
        return ResponseEntity.created(location).body(createUser);
    }


}
