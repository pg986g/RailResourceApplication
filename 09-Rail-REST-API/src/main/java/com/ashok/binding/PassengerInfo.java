package com.ashok.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class PassengerInfo {
	
	private String firstName;
	
	private String lastName;
	
	private String dateOfJourney;
	
	private String trainNumber;
	
	private String from;
	
	private String to;
	
	
	

}
