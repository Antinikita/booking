package com.nikita.eventbooking.controller;

import com.nikita.eventbooking.model.EventBookingModel;
import com.nikita.eventbooking.repository.EventBookingRepository;
import com.nikita.eventbooking.service.EventBookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class TestController {
    EventBookService eventBookService;
    EventBookingRepository eventBookingRepository;

    public TestController(EventBookService eventBookService, EventBookingRepository eventBookingRepository) {
        this.eventBookService = eventBookService;
        this.eventBookingRepository = eventBookingRepository;
    }

    @GetMapping("/test")
    public String test() {
        return "testEventBooking";
    }
    @PostMapping("/add")
    public EventBookingModel add(@RequestBody EventBookingModel eventBookingModel) {
       return eventBookService.add(eventBookingModel);
    }
}
