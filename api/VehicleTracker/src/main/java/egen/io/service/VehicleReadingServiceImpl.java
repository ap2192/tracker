package egen.io.service;

import egen.io.entity.VehicleReading;
import egen.io.repository.VehicleReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by amulya1 on 6/28/2017.
 */
@Service
public class VehicleReadingServiceImpl implements VehicleReadingService{
    @Autowired
    VehicleReadingRepository vehicleReadingRepository;
    @Transactional
    public void loadVehicleReading(VehicleReading vehicleReading) {
        vehicleReadingRepository.loadVehicleReading(vehicleReading);
    }
}
