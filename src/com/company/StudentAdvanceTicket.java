package com.company;

public class StudentAdvanceTicket extends AdvanceTicket {

    StudentAdvanceTicket(int ticketNumber, int days) {
        AdvanceTicket test = new AdvanceTicket(ticketNumber, days);
        price = test.getPrice() * 0.5;
        ticketID = ticketNumber;
    }

    public String toString () {
        String ticketType = "Student Advanced";
        return "Ticket Type: " + ticketType + ", Number: " + ticketID + ", Price: " + price + " (ID required)";
    }

}
