package com.toyota32bit.Inviso.Services;

import com.toyota32bit.Inviso.DataAccessObjects.RoleRepository;
import com.toyota32bit.Inviso.DataAccessObjects.UserRepository;
import com.toyota32bit.Inviso.Entities.Role;
import com.toyota32bit.Inviso.Entities.User;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional
public class UserService implements IUserService, UserDetailsService {

    Logger logger = LogManager.getLogger();
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

   @Override

    public User saveUser(@NotNull User user) {
        logger.info("Saving new user {} to the database",user.getName());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(@NotNull Role role) {
        logger.info("Saving new role {} to the database", role.getRoleName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        logger.info("Adding role {} to user {}",roleName,username);
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
    //UserDetail servisindeki methodu implemente ediyoruz kullanıcya rollerrin bir role olduğunu burada söylüyoruz
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = userRepository.findByUserName(username);
       if(user == null)
       {
           logger.error("User not found in the database");
           throw new UsernameNotFoundException("User not found in the database");
       }
       else
       {
           logger.info("User found in the database: {}",username);
       }
       Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
       user.getRoles().forEach(role -> {
           authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
       });
       return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),authorities);
    }
}
