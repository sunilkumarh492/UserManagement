package com.dev.pub;

import java.util.Date;
import java.util.List;

public interface UserService {
    public void addUser(User user);
    public List<User> displayAllUsers();
    public User displayUser(int id);
    public void deleteUser(int id);
    public void updateUser(User user);

    public Date timeStamp();
}
