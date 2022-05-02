package com.toyota32bit.Inviso.Services;

import com.toyota32bit.Inviso.Entities.Role;
import com.toyota32bit.Inviso.Entities.User;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

public interface IUserService {
    @PreAuthorize("hasAnyRole('ADMIN','SUPERVISOR')")
    User saveUser(User user);
    @PreAuthorize("hasAnyRole('ADMIN','SUPERVISOR')")
    Role saveRole(Role role);
    @PreAuthorize("hasAnyRole('ADMIN','SUPERVISOR')")
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
