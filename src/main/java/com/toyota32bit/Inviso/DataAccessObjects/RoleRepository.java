package com.toyota32bit.Inviso.DataAccessObjects;

import com.toyota32bit.Inviso.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName (String name);
}
