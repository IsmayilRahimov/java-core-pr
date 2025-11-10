package org.example.rentalcarprojects;

public class HybridCar extends Car {

    public HybridCar(String model, String plate, double basePricePerDay) {
        super(model, plate, basePricePerDay);
    }

    @Override
    public double calculateRentalPrice(int days) {
        return getBasePricePerDay() * days;
    }

}
