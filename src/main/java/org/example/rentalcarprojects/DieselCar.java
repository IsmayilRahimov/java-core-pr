package org.example.rentalcarprojects;

public class DieselCar extends Car {

    public DieselCar(String model, String plate, double basePricePerDay) {
        super(model, plate, basePricePerDay);
    }

    @Override
    public double calculateRentalPrice(int days) {
        return getBasePricePerDay() * days + 50; // tenzimleme isleri (50)
    }
}
