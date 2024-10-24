package com.sak.filesystem.service;

import com.sak.filesystem.data.Users;
import com.sak.filesystem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userrepo;

    public List<Users> getAllUsers() {
        return userrepo.findAll();
    }

    public Users saveUser(Users user){
        return userrepo.save(user);
    }

    public Optional<Users> getUserById(int id) {
        return userrepo.findById(id);
    }

    // Delete a user by ID
    public void deleteUser(int id) {
        userrepo.deleteById(id);
    }
}
