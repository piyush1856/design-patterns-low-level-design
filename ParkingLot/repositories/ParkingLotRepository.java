package ParkingLot.repositories;

import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingLotStatus;
import ParkingLot.models.SlotAssignmentStrategyType;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Integer , ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLotRepository() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setSlotAssignmentStrategyType(SlotAssignmentStrategyType.RANDOM);
        parkingLots.put(1, parkingLot);
    }

    public Optional<ParkingLot> findById(int id){
        if(parkingLots.containsKey(id)){
            return Optional.of(parkingLots.get(id));
        }
        return Optional.empty();
    }
}
