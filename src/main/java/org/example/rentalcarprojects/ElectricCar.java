package org.example.rentalcarprojects;

public class ElectricCar extends Car {

    public ElectricCar(String model, String plate, double basePricePerDay) {
        super(model, plate, basePricePerDay);
    }

    @Override
    public double calculateRentalPrice(int days) {
        return getBasePricePerDay() - days * 0.9;  // %10 endirim:
    }
}
