package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    private Map<String, Vehicle> vehicles = new TreeMap<>();
    private static int previousId = 0;
//    vehicle number is same as license Number
    public Optional<Vehicle> findByVehicleNumber(String licenseNumber){
        if(vehicles.containsKey(licenseNumber)){
            return Optional.of(vehicles.get(licenseNumber));
        }
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle){
        previousId++;
        vehicle.setId(previousId);
        vehicles.put(vehicle.getLicenseNumber(), vehicle);
        return vehicle;
    }
}
