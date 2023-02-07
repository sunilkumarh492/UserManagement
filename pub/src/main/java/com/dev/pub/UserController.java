package com.dev.pub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> displayAllUsers(){
       return userService.displayAllUsers();
    }
@GetMapping("/hi")
public void hi(){

}
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return userService.displayUser(id);
    }
    @PostMapping("/user/add")
    public void addUsers(@RequestBody User user){
        userService.addUser(user);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }
@PutMapping("user")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

//    @PostMapping("/user")
//    public List<User> addUser(@RequestParam int userId, @RequestParam String name, @RequestParam Double salary){
//        List<User> user=userService.addUsers(userId, name, salary);
//     return user;
//    }
}
