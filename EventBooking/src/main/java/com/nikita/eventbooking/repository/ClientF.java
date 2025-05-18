package com.nikita.eventbooking.repository;

import com.nikita.eventbooking.dto.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Client",url = "http://localhost:8765",path = "/client")
public interface ClientF {
    @GetMapping("/main/{id}")
    ClientDTO getClient(@PathVariable long id);
}
