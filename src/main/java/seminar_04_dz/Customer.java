package seminar_04_dz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    public int id;
    public List<Ticket> tickets;
    public CashProvider cash;

    public Customer(int id) {
        this.id = id;
        this.tickets = new ArrayList<>();
        this.cash = new CashProvider();
    }

    public Boolean buyTicket(Ticket ticket){
        if (ticket.isValid){
            if (cash.buy(ticket.price)) {
                this.tickets.add(ticket);
                TicketProvider ticketProvider = new TicketProvider();
                ticketProvider.updateTicketStatus(ticket);
                return  true;
            }
        }
        return false;
    }

    public Ticket search(long rootNumber){
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).rootNumber == rootNumber)
                return tickets.get(i);
        }
        return null;
    }


}
