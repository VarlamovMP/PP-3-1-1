package Boot_3_1_1.service;

import Boot_3_1_1.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUserById(Long id);

    void updateUser(Long id, User user);

    User getById(Long id);
}
