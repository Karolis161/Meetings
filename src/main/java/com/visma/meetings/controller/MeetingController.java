package com.visma.meetings.controller;

import com.visma.meetings.dto.Meeting;
import com.visma.meetings.dto.Person;
import com.visma.meetings.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/meeting")
public class MeetingController {

    private final MeetingService meetingService;

    @Autowired
    public MeetingController(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    @PostMapping("create")
    public void createMeeting(@RequestBody Meeting meeting){
        meetingService.createMeeting(meeting);
    }

    @DeleteMapping("delete")
    public void deleteMeeting(@RequestParam int id){
        meetingService.deleteMeeting(id);
    }

    @PostMapping("/person/add")
    public void addPersonToMeeting(@RequestBody Person person){
        meetingService.addPerson(person);
    }

    @DeleteMapping("person/delete")
    public void removePersonFromMeeting(@RequestParam int id){
        meetingService.deletePerson(id);
    }

    @GetMapping("get")
    public List<Meeting> getMeetings(Meeting meeting){
        return meetingService.getMeetings(meeting);
    }
}
