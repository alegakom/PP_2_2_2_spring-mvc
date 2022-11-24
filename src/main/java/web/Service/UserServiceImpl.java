package web.Service;


import web.DAO.UserDaoImpl;
import web.models.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoImpl cdi = new UserDaoImpl();
    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
