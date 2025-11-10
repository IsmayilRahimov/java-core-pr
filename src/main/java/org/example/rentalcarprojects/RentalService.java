package org.example.rentalcarprojects;

public class RentalService {

    public void rentCar(Car car, Customer customer, int days, Payment payment) {
        double price = car.calculateRentalPrice(days);
        System.out.println(customer.getName() + "" + "Adli musteri"
                + "" + car.getModel() + "" + car.getPlate() + " masinini" + days +
                " Gunluyune kirayeledi");

        System.out.println("Toplam qiyme" + price + " Azn");
        payment.pay(price);
    }
}
