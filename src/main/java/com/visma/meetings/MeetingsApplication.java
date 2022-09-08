package com.visma.meetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeetingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingsApplication.class, args);
		System.out.println("Meetings have started");
	}
}
