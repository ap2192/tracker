package egen.io.repository;

import egen.io.entity.Vehicle;
import egen.io.entity.VehicleReading;
import egen.io.exception.BadRequestException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by amulya1 on 6/28/2017.
 */
@Repository
public class VehicleReadingRepositoryImpl implements VehicleReadingRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void loadVehicleReading(VehicleReading vehicleReading) {


            entityManager.persist(vehicleReading);
        }
    }



