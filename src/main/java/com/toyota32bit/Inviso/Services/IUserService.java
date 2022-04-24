package com.toyota32bit.Inviso.Services;

import com.toyota32bit.Inviso.Entities.Role;
import com.toyota32bit.Inviso.Entities.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
