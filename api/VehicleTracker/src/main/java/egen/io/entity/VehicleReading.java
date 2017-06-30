package egen.io.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by amulya1 on 6/28/2017.
 */
@Entity
public class VehicleReading {

    @Id
    private String id;
    private String vin;
    private Float latitude;
    private Float longitude;
    private Timestamp timestamp;
    private Float fuelVolume;
    private Integer speed;
    private Integer engineHp;
    private Boolean checkEngineLightOn;
    private Boolean engineCoolantLow;
    private Boolean cruiseControlOn;
    private Integer engineRpm;
    @OneToOne (cascade = {CascadeType.ALL})
    private Tires tires;

   public VehicleReading()
    {
        this.id= UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(Float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(Integer engineHp) {
        this.engineHp = engineHp;
    }

    public Boolean getCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(Boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public Boolean getEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(Boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public Boolean getCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(Boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public Integer getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(Integer engineRpm) {
        this.engineRpm = engineRpm;
    }
}
