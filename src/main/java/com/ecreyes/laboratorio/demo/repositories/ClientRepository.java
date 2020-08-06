package com.ecreyes.laboratorio.demo.repositories;

import com.ecreyes.laboratorio.demo.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Long> {
}
