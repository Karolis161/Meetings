package com.visma.meetings.builder;

import com.visma.meetings.dto.Meeting;

import java.time.LocalDateTime;

public class MeetingBuilder {

    private int id;
    private String name;
    private String responsiblePerson;
    private String description;
    private String category;
    private String type;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public MeetingBuilder(int id, String name, String responsiblePerson, String description, String category, String type, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.name = name;
        this.responsiblePerson = responsiblePerson;
        this.description = description;
        this.category = category;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Meeting build(){
        Meeting meeting = new Meeting();

    }
}
