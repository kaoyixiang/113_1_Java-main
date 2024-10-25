import java.util.Scanner;
import  edu.shu.yixiang.*;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A001", 50),
                new CashCard("A002", 300),
                new CashCard("A003", 1000, 1),
                new CashCard("A004"),
                //new CashCard("A005", 3000, 3)
        };

        Scanner input = new Scanner(System.in);

        for(CashCard card : cards) {
            System.out.printf("為(%s, %d, %d)儲值:",
                    card.getNumber(), card.getBalance(), card.getBonus());

            card.store(input .nextInt());

            System.out.printf("明細(%s, %d, %d)%n",
                    card.getNumber(), card.getBalance(), card.getBonus());
        }
    }
}