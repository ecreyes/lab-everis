package com.ecreyes.laboratorio.demo.repositories;

import com.ecreyes.laboratorio.demo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    List<User> findUserByUsername(@Param("username") String username);

    @Query("SELECT u FROM User u where u.password IS NULL")
    List<User> findUserByPasswordNull();
}
