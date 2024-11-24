package Boot_3_1_1.dao;

import Boot_3_1_1.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUserById(Long id);

    User updateUser(User user);

    User getById(Long id);
}