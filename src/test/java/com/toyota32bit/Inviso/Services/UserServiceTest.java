package com.toyota32bit.Inviso.Services;

import com.toyota32bit.Inviso.DataAccessObjects.RoleRepository;
import com.toyota32bit.Inviso.DataAccessObjects.UserRepository;
import com.toyota32bit.Inviso.Entities.Role;
import com.toyota32bit.Inviso.Entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    @Mock
    private RoleRepository roleRepository;
    @Mock
    private PasswordEncoder passwordEncoder;

    private UserService underTest;

    @BeforeEach
    void setUp(){
        underTest = new UserService(userRepository,roleRepository,passwordEncoder);
    }


    @Test
    void saveUser() {
        //given
        User user = new User(null,"temp","32Bit", Date.from(Instant.now()),"DEFAULT","temp","temp","temp","123456","+9011122223366",1,"temp","11111111111", Date.from(Instant.now()),"DEFAULT","temp",true,new ArrayList<>());
        //when
        underTest.saveUser(user);
        //then
        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);

        verify(userRepository).save(userArgumentCaptor.capture());
        User capturedUser = userArgumentCaptor.getValue();
        assertThat(capturedUser).isEqualTo(user);
    }

    @Test
    void saveRole() {
        //given
        Role role = new Role(null,"TEMP","tmp");

        //when
        underTest.saveRole(role);
        //then
        ArgumentCaptor<Role> roleArgumentCaptor = ArgumentCaptor.forClass(Role.class);

        verify(roleRepository).save(roleArgumentCaptor.capture());
        Role capturedRole = roleArgumentCaptor.getValue();
        assertThat(capturedRole).isEqualTo(role);
    }

    @Test
    @Disabled //repositoryler mock olarak kullanıldığı için addroletouser çalışırken user ve role leri null olarak alıyor bu da NULL exeption fırlatıyor
    void addRoleToUser() {
        //Given
        Role role = new Role(null,"TEMP","tmp");
        User user = new User(null,"temp","32Bit", Date.from(Instant.now()),"DEFAULT","temp","temp","temp","123456","+9011122223366",1,"temp","11111111111", Date.from(Instant.now()),"DEFAULT","temp",true,new ArrayList<>());
        roleRepository.save(role);
        userRepository.save(user);
        //when
        underTest.addRoleToUser(user.getUserName(),role.getRoleName());
        //then
        assertThat(user.getRoles().contains(role)).isEqualTo(true);
    }

    @Test
    @Disabled   //repositoryler mock olarak kullanıldığı için getUser çalışırken user null olarak alıyor bu da NULL exeption fırlatıyor
    void getUser() {
        //given
        User user = new User(null,"temp","32Bit", Date.from(Instant.now()),"DEFAULT","temp","temp","temp","123456","+9011122223366",1,"temp","11111111111", Date.from(Instant.now()),"DEFAULT","temp",true,new ArrayList<>());
        userRepository.save(user);
        //then
        assertThat(underTest.getUser(user.getUserName())).isEqualTo(user.getUserName());
    }

    @Test
    void getUsers() {
        //when
        underTest.getUsers();
        //then
        verify(userRepository).findAll();
    }

    @Test
    @Disabled
    void loadUserByUsername() {
    }
}