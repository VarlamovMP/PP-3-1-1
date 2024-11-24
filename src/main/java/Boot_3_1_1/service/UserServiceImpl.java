package Boot_3_1_1.service;

//public class UserServiceImpl {
//}

import Boot_3_1_1.dao.UserDao;
import Boot_3_1_1.models.User;
import org.springframework.stereotype.Service;

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

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

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