package main.java.service;


import main.java.dao.UserDao;
import main.java.dao.UserDaoHibernateImpl;
import main.java.dao.UserDaoJDBCImpl;
import main.java.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserServiceImpl userServiceImpl = new UserServiceImpl();
    private UserDao userDao = new UserDaoHibernateImpl();

    public UserServiceImpl() {

    }

    public static UserServiceImpl getInstance() {
        return userServiceImpl;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userDao.deleteUser(userId);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public User getUserByLogin(String login) {
        return userDao.getUserByLogin(login);
    }
}
