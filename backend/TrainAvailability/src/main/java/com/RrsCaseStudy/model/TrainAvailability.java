package com.RrsCaseStudy.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString
@Document(collection = "trainAvailability")
public class TrainAvailability {
	@Id
	private int trainNo;
	private String trainName;
	private String startLocation;
	private String destination;
	private double ticketFair;
	private Date availableDate;
	public TrainAvailability() {
		
	}
	
	public TrainAvailability(int trainNo, String trainName, String startLocation, String destination,
			double ticketFair,Date availableDate) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.startLocation = startLocation;
		this.destination = destination;
		this.ticketFair = ticketFair;
		this.availableDate=availableDate;
	}

	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getTicketFair() {
		return ticketFair;
	}
	public void setTicketFair(double ticketFair) {
		this.ticketFair = ticketFair;
	}

	public Date getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	

}
