package com.toyota32bit.Inviso.Services;

import com.toyota32bit.Inviso.DataAccessObjects.RoleRepository;
import com.toyota32bit.Inviso.DataAccessObjects.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class HomePageService implements IHomePageService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public int getNumberOfUsers() {
        return (int)userRepository.findAll().stream().count();
    }

    @Override
    public int getNumberOfRoles() {
        return (int)roleRepository.findAll().stream().count();
    }
}
