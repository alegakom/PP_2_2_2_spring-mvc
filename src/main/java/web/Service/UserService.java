package web.Service;

import web.models.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUsers();
}
