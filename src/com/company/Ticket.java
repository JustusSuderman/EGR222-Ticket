package com.company;

import java.util.Random;

public class Ticket {
    public double price;
    public int ticketID;
    Random rand = new Random();

    public Ticket () {
        price = 50.0;
        ticketID = rand.nextInt(100) + 1;
    }

    public Ticket(double ticketPrice) {
        price = ticketPrice;
        ticketID = rand.nextInt(100) + 1;

    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Number: " + ticketID + ", Price: " + price;
    }
}
