package egen.io.repository;

import egen.io.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by amulya1 on 6/27/2017.
 */
@Repository
public class VehicleRepositoryImpl implements VehicleRepository{
    @PersistenceContext
    private EntityManager entityManager;

    public void loadVehicleList(List<Vehicle> vehicles) {

            for (Vehicle vehicle : vehicles) {
                if (entityManager.find(Vehicle.class, vehicle.getVin()) == null) {
                    entityManager.persist(vehicle);
                } else {
                    entityManager.merge(vehicle);
                }
            }
    }
}
