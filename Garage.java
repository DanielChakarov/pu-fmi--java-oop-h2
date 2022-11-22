package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    String name;
    List<Car> cars = new ArrayList<Car>(){};

    public Garage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }
}
