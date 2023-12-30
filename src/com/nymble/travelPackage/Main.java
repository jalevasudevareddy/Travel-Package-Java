package com.nymble.travelPackage;

public class Main {
	public static void main(String[] args) {
        // Test your implementation here
		TravelPackage travelPackage = new TravelPackage("Package 1", 10);
        Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD, 500.0);
        System.out.println(passenger);
    }
}
