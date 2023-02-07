package com.dev.pub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Scanner ip=new Scanner(System.in);

//    public void users(){
//     userJdbcTemplates.users();
//    }
//    public List<User> addUsers(int userId, String name, Double salary){
//        List<User> user= userJdbcTemplates.addUser(userId, name, salary);
//    return user;
//    }
@Override
public void addUser(User user) {
  jdbcTemplate.update(UserRepository.ADD_USER,user.getUserId(),user.getUserName(),user.getUserSalary(),user.getCreatedBy(),timeStamp());
}

    @Override
    public List<User> displayAllUsers() {
    List<User> user=jdbcTemplate.query(UserRepository.DISPLAY_ALL_USERS,new BeanPropertyRowMapper<>(User.class));
        return user;
    }

    @Override
    public User displayUser(int id) {
    User user=jdbcTemplate.queryForObject(UserRepository.GET_USER,new BeanPropertyRowMapper<>(User.class),id);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        jdbcTemplate.update(UserRepository.DELETE_USER,id);
    }

    @Override
    public void updateUser(User user) {
        System.out.println(timeStamp());
        jdbcTemplate.update(UserRepository.UPDATE_USER,user.getUserId(),user.getUserName(),user.getUserSalary(),user.getModifiedBy(),timeStamp(),user.getUserId());

    }

    @Override
    public Date timeStamp() {
    Date d=new Date();
        return d;
    }



}
