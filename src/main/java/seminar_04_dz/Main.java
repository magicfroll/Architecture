package seminar_04_dz;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса Метро
        Metro metro = new Metro();
        // Создаем билет, используя цену экземпляра класса Метро
        Ticket ticket1 = new Ticket(1, metro.getPrice(), -1);
        // Создаем произвольный билет
        Ticket ticket2 = new Ticket(1, 50, 12);
        // Создаем покупателя
        Customer customer1 = new Customer(1);
        // Создаем для покупателя кэш-провайдер
        customer1.cash = new CashProvider(123, 123, 200);
        // Покупатель проходит авторизацию
        customer1.cash.authorization(customer1);
        // Покупаем билет с ценой равной цене билета в метро
        customer1.buyTicket(ticket1);
        // Проверяем наличие билета у покупателя
        System.out.println(customer1.tickets);
        // Оплачиваем поездку в метро
        metro.payFare(customer1);
        // Повторно оплачиваем поездку в метро, но билетов уже нет
        metro.payFare(customer1);
        // Покупаем билет с ценой отличной от цены в метро
        customer1.buyTicket(ticket2);
        // Пытаемся оплатить проезд в метро, но у покупателя нет билета с необходимой ценой
        metro.payFare(customer1);
    }
}
