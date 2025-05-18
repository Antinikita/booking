package com.nikita.eventbooking.repository;

import com.nikita.eventbooking.dto.EventCreationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "EventCreation",url = "http://localhost:8765",path = "/eventcreation")
public interface EventCreationClient {
    @GetMapping("/main/details/{id}")
    EventCreationDTO details(@PathVariable("id") long id);
}
