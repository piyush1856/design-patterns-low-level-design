package ParkingLot.strategies;

import ParkingLot.models.*;

import java.util.Optional;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy {
    @Override
    public Optional<ParkingSlot> assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()) {
                if(parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY)
                && parkingSlot.getVehicleType().equals(vehicleType)) {
                    return Optional.of(parkingSlot);
                }
            }
        }
        return Optional.empty();
    }
}
