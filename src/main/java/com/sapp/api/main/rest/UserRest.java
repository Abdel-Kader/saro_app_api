package com.sapp.api.main.rest;


import org.springframework.web.bind.annotation.*;

import com.sapp.api.main.entities.User;
import com.sapp.api.main.repositories.UserRepository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
public class UserRest
{
    @Resource
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Optional<User> findOneUser(@PathVariable Long id)
    {
        return userRepository.findById(id);
    }

    @GetMapping("/allUsers")
    public List<User> findAllUsers()
    {
        return userRepository.findAll();
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }
    
    @PostMapping("/editUser")
    public User editUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }
    
    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable Long id)
    {
    	userRepository.deleteById(id);
    }
}
