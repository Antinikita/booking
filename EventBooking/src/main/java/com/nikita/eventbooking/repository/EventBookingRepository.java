package com.nikita.eventbooking.repository;

import com.nikita.eventbooking.model.EventBookingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventBookingRepository extends JpaRepository<EventBookingModel, Integer> {
}
