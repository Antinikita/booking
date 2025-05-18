package com.nikita.eventbooking.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EventCreationDTO {
    private String eventName;
    private String description;
    private String location;
    private Date date;
}
