package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.GateStatus;
import ParkingLot.models.GateType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Integer, Gate> gates = new TreeMap<>();

    public GateRepository(){
        Gate gate = new Gate();
        gate.setId(1);
        gate.setGateNumber("1A");
        gate.setGateType(GateType.ENTRY);
        gate.setGateStatus(GateStatus.OPEN);
        gates.put(gate.getId(), gate);
    }
    public Optional<Gate> findGateById(int gateId){
        if(gates.containsKey(gateId)){
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}
// select parking_lot_id from gates where gate_id = 3;


// database : might give the data in the form of JSON , String
// ORM : Object relational mapping : Hibernate