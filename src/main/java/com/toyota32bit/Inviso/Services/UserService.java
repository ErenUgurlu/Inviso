package com.toyota32bit.Inviso.Services;

import com.toyota32bit.Inviso.DataAccessObjects.RoleRepository;
import com.toyota32bit.Inviso.DataAccessObjects.UserRepository;
import com.toyota32bit.Inviso.Entities.Role;
import com.toyota32bit.Inviso.Entities.User;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @RequiredArgsConstructor @Transactional
public class UserService implements IUserService{

    Logger logger = LogManager.getLogger();
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        logger.info("Saving new user {} to the database",user.getName());
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        logger.info("Saving new role {} to the database", role.getRoleName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        logger.info("Adding role {} to user {}",username);
        User user = userRepository.findByUserName((username));
        Role role = roleRepository.findByRoleName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        logger.info("Fetching the user {}",username);
        return userRepository.findByUserName(username);
    }

    @Override
    public List<User> getUsers() {
        logger.info("Fetching the all users");
        return userRepository.findAll();
    }
}
