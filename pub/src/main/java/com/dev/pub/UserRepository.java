package com.dev.pub;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public static String DISPLAY_ALL_USERS="select * from user";
    public static String ADD_USER="insert into user(userId,userName,userSalary,createdBy,createdTimestamp) values(?,?,?,?,?)";
    public static String GET_USER="select * from user where userId=?";
    public static String DELETE_USER="delete from user where userId=?";
    public static String UPDATE_USER="update user set userId=?,userName=?,userSalary=?,modifiedBy=?,modifiedTimestamp=? where userId=?";
    public static final String FIND_USER_BY_ID="select * from user where userId=?";

}
