package com.t313.dao;

import com.t313.model.User;
import java.util.List;

public interface UserDao {

    User getUserByName(String name);

    void save(User user);

    User get(Long id);

    void update(User user);

    void delete(Long id);

    List<User> getAllUsers();
}