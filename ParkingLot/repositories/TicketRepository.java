package ParkingLot.repositories;

import ParkingLot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Integer , Ticket> tickets = new TreeMap<>();
    private static int previousId = 0;
    public Ticket save(Ticket ticket){
        ticket.setId(previousId++);
        ticket.setNumber("TICKET#" + previousId);
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }
}
