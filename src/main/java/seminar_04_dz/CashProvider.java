package seminar_04_dz;

import java.util.Scanner;

public class CashProvider {
    private long card;
    private long hashCard;
    private double cashBalance;
    private Boolean isAuthorization;


    public CashProvider() {
    }

    public CashProvider(long card, long hashCard, double cashBalance) {
        this.card = card;
        this.hashCard = hashCard;
        this.cashBalance = cashBalance;
        this.isAuthorization = false;
    }

    public Boolean buy(double price){
        if (this.isAuthorization){
            if (cashBalance < price) {
                System.out.println("На вашем счету недостаточно средств");
                return false;
            } else {
                this.cashBalance -= price;
                System.out.println("Совершена покупка на сумму " + price);
                return true;
            }

        } else {
            System.out.println("Для совершения покупки вам необходимо авторизоваться");
            return false;
        }
    }

    public void authorization(Customer customer){
        Scanner in = new Scanner(System.in);
        System.out.println(("Введите номер карты: "));
        String auth_card = in.next();
        System.out.println(("Введите хэш карты"));
        String auth_hash = in.next();

        if (this.card == Long.parseLong(auth_card) && this.hashCard == Long.parseLong(auth_hash)){
            this.isAuthorization = true;
            System.out.println("Вы авторизованы");
        } else {
            System.out.println("Вы не прошли авторизацию");
        }
    }
}
