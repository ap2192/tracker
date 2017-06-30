package egen.io.controller;

/**
 * Created by amulya1 on 6/28/2017.
 */
import egen.io.entity.VehicleReading;
import egen.io.exception.BadRequestException;
import egen.io.service.VehicleReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://mocker.egen.io")
@RestController
public class VehicleReadingController {
    @Autowired
    VehicleReadingService vehicleReadingService;

    @RequestMapping(value = "readings", method = RequestMethod.POST)

    public void loadVehicleReading(@RequestBody VehicleReading vehicleReading) {

            vehicleReadingService.loadVehicleReading(vehicleReading);

    }
}