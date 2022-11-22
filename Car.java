package com.company;

import java.util.Date;

public class Car extends Vehicle {
    Integer fuelConsumption;
    Integer tankVolume;
    Fuel fuel;
    Integer power;
    Transmission transmission;
    Integer yearOfCreation;
    Date dateOfRegistration;
    Date dateOfInsurance;
    Date dateOfInspection;
    Date dateOfNextTireChange;
    Long kilometersForOilChange;

        public Car(String type, String registrationNumber, String brand, String model,
                   Integer fuelConsumption, Integer power, Date dateOfRegistration, Date dateOfInsurance) {
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.power = power;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfInsurance = dateOfInsurance;
    }

    public Car(Integer fuelConsumption, Integer tankVolume, Fuel fuel, Integer power, Transmission transmission,
               Integer yearOfCreation, Date dateOfRegistration, Date dateOfInsurance, Date dateOfInspection,
               Date dateOfNextTireChange, Long kilometersForOilChange) {
        this.fuelConsumption = fuelConsumption;
        this.tankVolume = tankVolume;
        this.fuel = fuel;
        this.power = power;
        this.transmission = transmission;
        this.yearOfCreation = yearOfCreation;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfInsurance = dateOfInsurance;
        this.dateOfInspection = dateOfInspection;
        this.dateOfNextTireChange = dateOfNextTireChange;
        this.kilometersForOilChange = kilometersForOilChange;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Integer getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(Integer tankVolume) {
        this.tankVolume = tankVolume;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(Integer yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Date getDateOfInsurance() {
        return dateOfInsurance;
    }

    public void setDateOfInsurance(Date dateOfInsurance) {
        this.dateOfInsurance = dateOfInsurance;
    }

    public Date getDateOfInspection() {
        return dateOfInspection;
    }

    public void setDateOfInspection(Date dateOfInspection) {
        this.dateOfInspection = dateOfInspection;
    }

    public Date getDateOfNextTireChange() {
        return dateOfNextTireChange;
    }

    public void setDateOfNextTireChange(Date dateOfNextTireChange) {
        this.dateOfNextTireChange = dateOfNextTireChange;
    }

    public Long getKilometersForOilChange() {
        return kilometersForOilChange;
    }

    public void setKilometersForOilChange(Long kilometersForOilChange) {
        this.kilometersForOilChange = kilometersForOilChange;
    }
}
