package com.toyota32bit.Inviso.DataAccessObjects;

import com.toyota32bit.Inviso.Entities.Role;
import com.toyota32bit.Inviso.Entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void itShouldFindUserWithUsername() {
        //when
        User user = new User(null,"temp","32Bit", Date.from(Instant.now()),"DEFAULT","temp","temp","temp","123456","+9011122223366",true,"temp","11111111111", Date.from(Instant.now()),"DEFAULT","temp",true,new ArrayList<>());
        User savedUser = userRepository.save(user);
        /* when */
        User foundUser = userRepository.findByUserName("temp");
        //then
        assertThat(foundUser.getUserName()).isEqualTo(savedUser.getUserName());
    }
}