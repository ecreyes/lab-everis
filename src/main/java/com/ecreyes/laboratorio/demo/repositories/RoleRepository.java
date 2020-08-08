package com.ecreyes.laboratorio.demo.repositories;

import com.ecreyes.laboratorio.demo.models.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
}
