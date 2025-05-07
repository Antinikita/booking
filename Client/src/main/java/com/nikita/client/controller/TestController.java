package com.nikita.client.controller;

import com.nikita.client.model.Client;
import com.nikita.client.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class TestController {
    ClientRepository clientRepository;

    public TestController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/test")
    public String test() {
        return "testClient";
    }

    @PostMapping("/add")
    public Client add(@RequestBody Client client) {
        clientRepository.save(client);
        return client;
    }
    @GetMapping
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
