package egen.io.repository;

import egen.io.entity.Vehicle;

import java.util.List;

/**
 * Created by amulya1 on 6/27/2017.
 */

public interface VehicleRepository {
    void loadVehicleList(List<Vehicle> vehicles);
}
