package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request){
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(
                    request.getVehicleNumber(),
                    request.getOwnerName(),
                    request.getVehicleType(),
                    request.getGateId(),
                    request.getParkingLotId()
            );

            response.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setMessage("Ticket Generated Successfully");
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(ex.getMessage());
        }
        return response;
    }
}

// Data Transfer Object

// IssueTicketRequest


// HW : Generate Bill

// BillController
// ticketID




