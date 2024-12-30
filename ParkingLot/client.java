package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

public class client {
    public static void main(String[] args) {
        // call the constructor
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setOwnerName("Mohit");
        issueTicketRequestDTO.setParkingLotId(1);
        issueTicketRequestDTO.setGateId(1);
        issueTicketRequestDTO.setVehicleNumber("DL1VC0001");
        issueTicketRequestDTO.setVehicleType(VehicleType.THREE_WHEELER);

        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(issueTicketRequestDTO);
        System.out.println(responseDTO.getMessage());
        System.out.println(responseDTO.getTicket().getNumber());

    }
}

// Controller : IssueTicket : TicketController
