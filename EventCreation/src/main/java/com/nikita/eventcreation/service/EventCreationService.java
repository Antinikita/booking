package com.nikita.eventcreation.service;

import com.nikita.eventcreation.dto.EventCreationDTO;
import com.nikita.eventcreation.dto.PublisherDTO;
import com.nikita.eventcreation.model.Event;
import com.nikita.eventcreation.repository.EventRepository;
import com.nikita.eventcreation.repository.PublisherClient;
import org.springframework.stereotype.Service;

@Service
public class EventCreationService {
    private final EventRepository eventRepository;
    PublisherClient publisherClient;

    public EventCreationService(PublisherClient publisherClient, EventRepository eventRepository) {
        this.publisherClient = publisherClient;
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event event) {
            if (publisherClient.getPublisher(event.getPublisherId())!=null){
                return eventRepository.save(event);
            }
            return null;
    }

    public EventCreationDTO getEventCreationDTO(long eventId) {
        Event event = eventRepository.findById(eventId);

        PublisherDTO publisherDTO;
        try {
            publisherDTO = publisherClient.getPublisher(event.getPublisherId());
        } catch (Exception e) {
            throw new RuntimeException("Publisher not found for event with ID: " + eventId);
        }
        System.out.println("Publisher ID: " + event.getPublisherId());

        EventCreationDTO dto = new EventCreationDTO();
        dto.setEventName(event.getEventName());
        dto.setDate(event.getDate());
        dto.setDescription(event.getDescription());
        dto.setLocation(publisherDTO.getPublisherLocation());
        dto.setPublisher(publisherDTO);

        return dto;
    }

}
