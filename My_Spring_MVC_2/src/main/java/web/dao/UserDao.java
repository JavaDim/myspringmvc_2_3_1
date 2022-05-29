package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void deleteUser(int id);

    User updateUser(User user);

    List<User> getAllUsers();

    User getUser(int id);
}
