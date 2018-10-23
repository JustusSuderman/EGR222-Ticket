package com.company;

public class WalkupTicket extends Ticket {




    public String toString () {
        String ticketType = "Walk-Up";
        return "Ticket Type: " + ticketType + ", Number: " + ticketID + ", Price: " + price;
    }
}
