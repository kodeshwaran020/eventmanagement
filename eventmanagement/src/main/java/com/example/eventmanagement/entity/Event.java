package com.example.eventmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Event {
    @Id
    private Long id;
    private String name;
    private String date;
    private String locations;

}
