package com.nikita.eventbooking.dto;

import lombok.Data;

@Data
public class ClientDTO {
    private long id;
    private String username;
    private String email;
    private String password;
}