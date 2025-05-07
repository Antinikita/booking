package com.nikita.eventcreation.repository;

import com.nikita.eventcreation.dto.PublisherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Publisher",url = "http://localhost:8765",path = "/publisher")
public interface PublisherClient {
    @GetMapping("/main/{id}")
    PublisherDTO getPublisher(@PathVariable("id") Long id);
}
