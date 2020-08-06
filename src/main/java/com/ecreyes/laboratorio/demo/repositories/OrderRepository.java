package com.ecreyes.laboratorio.demo.repositories;

import com.ecreyes.laboratorio.demo.models.Client;
import com.ecreyes.laboratorio.demo.models.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {
    @Query("SELECT o FROM Order o where o.client.idClient = :idclient")
    List<Order> getOrdersByIdClient( @Param("idclient") long idclient);
    
    List<Order> getOrderByDescription(@Param("description") String description);
    
}
