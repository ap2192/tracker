package egen.io.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by amulya1 on 6/27/2017.
 */
@Entity
public class Vehicle {
    @Id
    private String vin;
    private String make;
    private String model;
    private Integer year;
    private Integer redLineRpm;
    private Integer maxFuelVolume;
    private String lastServiceDate;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRedlineRpm() {
        return redLineRpm;
    }

    public void setRedlineRpm(Integer readLineRpm) {
        this.redLineRpm = readLineRpm;
    }

    public Integer getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(Integer maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
}

