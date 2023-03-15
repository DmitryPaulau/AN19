package lesson6.atm;

import java.util.Scanner;

public class ATM {
    int banknoteDenomination20 = 20;
    int banknoteDenomination50 = 50;
    int banknoteDenomination100 = 100;

    public ATM() {
    }

    public ATM(int banknoteDenomination20, int banknoteDenomination50, int banknoteDenomination100) {
        this.banknoteDenomination20 = banknoteDenomination20;
        this.banknoteDenomination50 = banknoteDenomination50;
        this.banknoteDenomination100 = banknoteDenomination100;
    }

    int depositingMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите сумму: ");
        int money = scanner.nextInt();
        System.out.println("Сумма внесения: " + money + "$");
        return money;
    }

}
