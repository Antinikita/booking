package com.nikita.eventcreation.controller;

import com.nikita.eventcreation.dto.EventCreationDTO;
import com.nikita.eventcreation.model.Event;
import com.nikita.eventcreation.repository.EventRepository;
import com.nikita.eventcreation.service.EventCreationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class TestController {
    EventRepository eventRepo;
    EventCreationService eventService;

    public TestController(EventRepository eventRepo, EventCreationService eventService) {
        this.eventRepo = eventRepo;
        this.eventService = eventService;
    }

    @GetMapping("/test")
    public String test() {
        return "testEventCreatation";
    }

    @PostMapping("/add")
    public void add(@RequestBody Event event) {
        eventService.createEvent(event);
    }
    @GetMapping("/details/{id}")
    public EventCreationDTO details(@PathVariable("id") long id) {
        return eventService.getEventCreationDTO(id);
    }
}
