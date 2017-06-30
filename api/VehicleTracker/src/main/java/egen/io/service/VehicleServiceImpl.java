package egen.io.service;

import egen.io.entity.Vehicle;
import egen.io.exception.BadRequestException;
import egen.io.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by amulya1 on 6/27/2017.
 */
@Service
public class VehicleServiceImpl implements VehicleService{
   @Autowired
    VehicleRepository vehicleRepository;
@Transactional
    public void loadVehicleList(List<Vehicle> vehicles) {

        vehicleRepository.loadVehicleList(vehicles);
}}
