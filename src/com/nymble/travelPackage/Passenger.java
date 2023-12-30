package com.nymble.travelPackage;
import java.util.ArrayList;
import java.util.List;

enum PassengerType {
    STANDARD, GOLD, PREMIUM
}
public class Passenger {
	private String name;
    private int passengerNumber;
    private double balance;
    private PassengerType type;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, PassengerType type, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

    public void signUpForActivity(Activity activity) {
        if (type == PassengerType.STANDARD) {
            if (balance >= activity.getCost()) {
                balance -= activity.getCost();
                activities.add(activity);
            }
        } else if (type == PassengerType.GOLD) {
            double discountedCost = 0.9 * activity.getCost();
            if (balance >= discountedCost) {
                balance -= discountedCost;
                activities.add(activity);
            }
        } else {
            // Premium passenger signs up for free
            activities.add(activity);
        }
    }


	public void printDetails() {
        System.out.println("Passenger Details:");
        System.out.println("Name: " + name);
        System.out.println("Number: " + passengerNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Activities:");
        for (Activity activity : activities) {
            System.out.println("- " + activity.getName() +
                    " at " + activity.getDestination().getName() +
                    ", Price: " + activity.getCost());
        }
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }
    
    @Override
	public String toString() {
		return "Passenger [name=" + name + ", passengerNumber=" + passengerNumber + ", balance=" + balance + ", type="
				+ type + ", activities=" + activities + "]";
	}
}
