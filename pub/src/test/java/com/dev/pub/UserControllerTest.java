package com.dev.pub;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    @Autowired
   private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserRepository userRepository;
    @Autowired
   private UserService userService;
@Test
    public void displayAllUsers() {
       User user=jdbcTemplate.queryForObject(UserRepository.FIND_USER_BY_ID,new BeanPropertyRowMapper<>(User.class),148);
        assertTrue(user.getUserName().equals("sqam534"));

    }

}