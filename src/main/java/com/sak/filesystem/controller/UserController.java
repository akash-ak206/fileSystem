package com.sak.filesystem.controller;

import com.sak.filesystem.data.Users;
import com.sak.filesystem.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping
    public Users createUser(@RequestBody Users user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public Optional<Users> getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    // Delete user by ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

}
