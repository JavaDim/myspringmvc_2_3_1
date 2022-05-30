package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
       userDao.updateUser(user);
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
