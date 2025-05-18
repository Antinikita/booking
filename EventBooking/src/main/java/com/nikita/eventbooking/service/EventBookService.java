package com.nikita.eventbooking.service;

import com.nikita.eventbooking.model.EventBookingModel;
import com.nikita.eventbooking.repository.ClientF;
import com.nikita.eventbooking.repository.EventBookingRepository;
import com.nikita.eventbooking.repository.EventCreationClient;
import org.springframework.stereotype.Service;

@Service
public class EventBookService {
    ClientF clientF;
    EventBookingRepository eventBookingRepository;
    EventCreationClient eventCreationClient;

    public EventBookService(ClientF clientF, EventBookingRepository eventBookingRepository, EventCreationClient eventCreationClient) {
        this.clientF = clientF;
        this.eventBookingRepository = eventBookingRepository;
        this.eventCreationClient = eventCreationClient;
    }

    public EventBookingModel add(EventBookingModel eventBookingModel) {
        if(clientF.getClient(eventBookingModel.getClientId()) != null && eventCreationClient.details(eventBookingModel.getEventId()) != null) {
            eventBookingRepository.save(eventBookingModel);
            return eventBookingModel;
        }
        return null;
    }
}
