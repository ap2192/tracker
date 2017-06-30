package egen.io.controller;

import egen.io.entity.Vehicle;
import egen.io.exception.BadRequestException;
import egen.io.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://mocker.egen.io")
@RestController
public class VehicleController
{
    @Autowired
    VehicleService vehicleService;
    @RequestMapping(value="vehicles", method = RequestMethod.PUT)
    public void loadVehicleList(@RequestBody List<Vehicle> vehicles){
        if(vehicles.size() == 0)
        {throw new BadRequestException(" Vehicle data is empty");

        }else
        {
        vehicleService.loadVehicleList(vehicles);
 }}
}
