package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



public class ParkingApi {

    private List<EnterOutParking> parking;

    public ParkingApi() {

        parking = new ArrayList<>();

        parking.add(new EnterOutParking("WD321342", "Toyota", "Yaris"));
        parking.add(new EnterOutParking("OR234653", "Opel", "Astra"));
        parking.add(new EnterOutParking("ZE213733", "BMW", "6"));
        parking.add(null);

    }

    public List<EnterOutParking> getParking() {
        return parking;
    }

    public EnterOutParking getAll(String i) {
        Optional<EnterOutParking> first = parking.stream().
                filter(e -> e.getId() == i)
                .findFirst();

        return first.get();
    }

    //postMapping
    public boolean addCar(EnterOutParking car) {
        return parking.add(car);
    }


    //putMapping
    public boolean updateCar(EnterOutParking car) {
        return parking.add(car);
    }

    public boolean deleteCar(String i) {
        return parking.removeIf(e -> e.getId() == i);
    }
}

