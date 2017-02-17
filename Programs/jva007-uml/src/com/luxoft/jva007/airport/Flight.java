package com.luxoft.jva007.airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Flight {
	private String id;
	private int runaway;
	private Date departureTime;
	private Date arrivalTime;
	private List<Client> passengersList = new ArrayList<Client>();
	
	public Flight(String id, int runaway, Date departureTime, Date arrivalTime){
		this.id = id;
		this.runaway = runaway;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	
	public String getId(){
		return id;
	}
	
	public int getRunaway(){
		return runaway;
	}
	
	public Date getDepartureTime(){
		return departureTime;
	}
	
	public Date getArrivalTime(){
		return arrivalTime;
	}
	
	public List<Client> getPassengersList() {
		return Collections.unmodifiableList(passengersList);
	}
	
	public boolean addPassenger(Client client) {
		return passengersList.add(client);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
    	sb.append("Flight nr: ")
    	  .append(id)
    	  .append(" has ")
    	  .append(passengersList.size())
    	  .append(" passengers, departure time: ")
    	  .append(departureTime)
    	  .append(" from runaway: ")
    	  .append(runaway)
    	  .append(" and will arrive at destination: ")
    	  .append(arrivalTime);
    	  
    	return sb.toString();
	}

}

