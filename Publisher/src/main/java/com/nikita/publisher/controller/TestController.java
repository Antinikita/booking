package com.nikita.publisher.controller;

import com.nikita.publisher.dto.PublisherDTO;
import com.nikita.publisher.model.Publisher;
import com.nikita.publisher.repository.PublisherRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class TestController {
    PublisherRepository publisherRepository;

    public TestController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @GetMapping("/test")
    public String test() {
        return "testPublisher";
    }

    @PostMapping("/add")
    public Publisher add(@RequestBody Publisher publisher) {
        publisherRepository.save(publisher);
        return publisher;
    }

    @GetMapping
    public List<Publisher> getAll() {
        return publisherRepository.findAll();
    }

    @GetMapping("/{id}")
    public PublisherDTO getPublisher(@PathVariable Long id) {
        Publisher publisher = publisherRepository.findById(id);

        PublisherDTO dto = new PublisherDTO();
        dto.setPublisherId(publisher.getId());
        dto.setPublisherName(publisher.getCompanyName());
        dto.setPublisherLocation(publisher.getLocation());

        return dto;
    }
}
