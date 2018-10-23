package com.company;

public class AdvanceTicket extends Ticket {

    public int days;

    public AdvanceTicket() {

    }

    public AdvanceTicket(int ticketNumber, int advanceDays) {
        days = advanceDays;
        ticketID = ticketNumber;
        if (advanceDays >= 10) {
            price = price * 0.6;
        } else {
            price = price * 0.8;
        }

    }

    public double getPrice() {
        return price;
    }

    public String toString () {
        String ticketType = "Advanced";
        return "Ticket Type: " + ticketType + ", Number: " + ticketID + ", Price: " + price;
    }
}
