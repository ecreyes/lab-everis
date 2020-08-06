package com.ecreyes.laboratorio.demo.controllers;

import com.ecreyes.laboratorio.demo.models.Client;
import com.ecreyes.laboratorio.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> getClients(){
        return (List<Client>) clientRepository.findAll();
    }
}
