package org.example.rentalcarprojects;

public class MainRental {
    public static void main(String[] args) {
        Customer customer = new Customer("Ismayil Rahimov ", "7N08ERD", "0504842472");
        ElectricCar tesla = new ElectricCar("Tesla model", "10-AB-777", 1000);
        Car bmwDisel = new DieselCar("BMW 320d", "10-MA-777", 500);
        Car toyota = new HybridCar("Toyota Corolla", "10-MM-999", 700);

        Payment creditCard = new CreditCardPayment();
        Payment cash = new CashPayment();

        RentalService rentalService = new RentalService();

        rentalService.rentCar(tesla, customer, 3, creditCard);
        System.out.println("---------------------------------------------------------");
        rentalService.rentCar(bmwDisel, customer, 1, cash);
        System.out.println("---------------------------------------------------------");
        rentalService.rentCar(toyota, customer, 5, creditCard);

    }

}
