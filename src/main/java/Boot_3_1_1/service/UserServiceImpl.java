package Boot_3_1_1.service;

import Boot_3_1_1.dao.UserDao;
import Boot_3_1_1.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

    @Transactional
    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userDao.updateUser(user);
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }
}