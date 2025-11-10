package org.example.rentalcarprojects;

public abstract class Car {

    private String model;   //modeli
    private String plate;    //masinin nomresi
    private double basePricePerDay;  // gunluk masinin qiymeti

    public Car(String model, String plate, double basePricePerDay) {
        this.model = model;
        this.plate = plate;
        this.basePricePerDay = basePricePerDay;
    }


    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public double getBasePricePerDay() {
        return basePricePerDay;
    }

    public abstract double calculateRentalPrice(int days);


}
