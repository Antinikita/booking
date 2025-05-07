package com.nikita.eventcreation.repository;

import com.nikita.eventcreation.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    public Event findById(long eventId);
}
