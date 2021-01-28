package com.ashok.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.binding.PassengerInfo;
import com.ashok.binding.TicketInfo;

@RestController
public class RailRestController {

	
	@PostMapping(value="/bookTicket",
			
			produces= {"application/xml", "application/json"},
			consumes= {"application/xml", "application/json"}
			
			)
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passengerInfo){
		
		
		TicketInfo ticket = new TicketInfo();
		
		ticket.setTicketId(9847453);
		ticket.setPnrStatus("CONFIRMED");
		ticket.setFrom(passengerInfo.getFrom());
		ticket.setTo(passengerInfo.getTo());
		ticket.setTicketPrice("350.00");
		return new ResponseEntity<TicketInfo>(ticket, HttpStatus.CREATED);
	}
	
	
}
