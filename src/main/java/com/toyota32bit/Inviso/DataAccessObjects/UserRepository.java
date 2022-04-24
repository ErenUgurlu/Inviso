package com.toyota32bit.Inviso.DataAccessObjects;

import com.toyota32bit.Inviso.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //Repositorileri kendin yaz
    User findByUserName(String name);
}
