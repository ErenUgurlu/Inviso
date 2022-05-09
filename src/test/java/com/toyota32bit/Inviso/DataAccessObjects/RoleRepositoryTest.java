package com.toyota32bit.Inviso.DataAccessObjects;

import com.toyota32bit.Inviso.Entities.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void itShouldFindRoleWithRoleName() {
        //given
        Role role = new Role(null,"TEMP","tmp");
        Role savedRole = roleRepository.save(role);
        //when
        Role foundRole = roleRepository.findByRoleName("TEMP");
        //then
        assertThat(foundRole.getRoleName()).isEqualTo(savedRole.getRoleName());

    }
}