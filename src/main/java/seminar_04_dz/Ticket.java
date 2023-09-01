package seminar_04_dz;

import java.util.Date;

public class Ticket {
    public long rootNumber;
    public double price;
    public int place;
    public Date date;
    public Boolean isValid;


    public Ticket(long rootNumber, double price, int place) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.isValid = true;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", price=" + price +
                ", place=" + place +
                ", date=" + date +
                ", isValid=" + isValid +
                '}';
    }
}
