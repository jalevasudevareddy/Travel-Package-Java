package com.nymble.travelPackage;
import org.junit.Test;

import static org.junit.Assert.*;
public class TravelPackageTest {
	@Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Package 1", 10);
        Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD, 500.0);

        assertTrue(travelPackage.addPassenger(passenger));
        assertEquals(1, travelPackage.getPassengers().size());
    }

    // Add more test cases for other methods in TravelPackage and other classes.
}
