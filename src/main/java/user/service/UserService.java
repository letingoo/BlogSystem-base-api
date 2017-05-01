package user.service;

import user.entity.User;

/**
 * Created by BASA on 2017/4/27.
 */
public interface UserService {

    void addUser(User user);

    User doLogin(String userName, String password);

    void updateUser(User user);

}
