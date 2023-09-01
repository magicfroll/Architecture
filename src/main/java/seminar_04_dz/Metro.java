package seminar_04_dz;

import java.util.ArrayList;
import java.util.List;

public class Metro {
    private final double price;

    public Metro() {
        this.price = 100;
    }
    public double getPrice() {
        return price;
    }
    public void payFare(Customer customer){
        if (customer.tickets.size() > 0){
            for (int i = 0; i < customer.tickets.size(); i++) {
                if (customer.tickets.get(i).price == this.price) {
                    customer.tickets.remove(i);
                    System.out.println("Вы успешно оплатили проезд в метро");
                    break;
                } else {
                    System.out.println("У вас нет билета подходящей стоимости");
                }
            }
        } else {
            System.out.println("У вас нет билетов");
        }
    }
}
