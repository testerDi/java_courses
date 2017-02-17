package com.luxoft.jva007.airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class Airport {
	
	private String name;

	List<Flight> flights = new ArrayList<Flight>();
	
	public Airport(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Flight> getFlightsList() {
		return Collections.unmodifiableList(flights);
	}
	
	public boolean addFlight(Flight flight) {
		return flights.add(flight);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Flight flight : flights) {
			sb.append(flight)
			  .append("\n");
		}
		
		return sb.toString();
	}
	
	public static void main(String [] args){
		Client client = new Client("John", "Smith", "045762666");
		SpecialClient specialClient = new SpecialClient("Andrew", "Smith", "54557", 26);

		Flight flight = new Flight("RO007", 17, new GregorianCalendar(2015, 4, 31, 15, 0, 0).getTime(), new GregorianCalendar(2015, 4, 31, 17, 0, 0).getTime());
		
		flight.addPassenger(client);
		flight.addPassenger(specialClient);
		
		Airport airport = new Airport("Henri Coanda Bucharest");
		airport.addFlight(flight);
		
		System.out.println(airport);
		
	}

}
