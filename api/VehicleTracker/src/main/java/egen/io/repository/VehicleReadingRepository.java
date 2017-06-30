package egen.io.repository;

import egen.io.entity.VehicleReading;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by amulya1 on 6/28/2017.
 */

public interface VehicleReadingRepository {
    void loadVehicleReading(VehicleReading vehicleReading);
}
