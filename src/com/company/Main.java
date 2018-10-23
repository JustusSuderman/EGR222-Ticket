package com.company;

public class Main {

    public static void main(String[] args) {
        Ticket Client = new Ticket(30);
        System.out.println(Client.toString());
        Ticket Client2 = new Ticket();
        System.out.println(Client2.toString());

        WalkupTicket WalkClient = new WalkupTicket();
        System.out.println(WalkClient.toString());
        WalkupTicket WalkClient2 = new WalkupTicket();
        System.out.println(WalkClient2.toString());

        AdvanceTicket AdvanceClient = new AdvanceTicket(105, 11);
        System.out.println(AdvanceClient.toString());
        AdvanceTicket AdvanceClient2 = new AdvanceTicket(22, 8);
        System.out.println(AdvanceClient2.toString());

        StudentAdvanceTicket StudentClient = new StudentAdvanceTicket(111, 15);
        System.out.println(StudentClient.toString());
        StudentAdvanceTicket StudentClient2 = new StudentAdvanceTicket(2, 5);
        System.out.println(StudentClient2.toString());
    }
}
