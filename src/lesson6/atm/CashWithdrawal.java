package lesson6.atm;

import java.util.Scanner;

public class CashWithdrawal {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        int depositingMoney = atm.depositingMoney();

        boolean success = false;
        do {
            System.out.println("Укажите сумму, которую желаете снять: ");
            int cashWithdrawal = scanner.nextInt();
            if (cashWithdrawal <= depositingMoney) {
                int remainder = depositingMoney - cashWithdrawal;

                int remainder100 = cashWithdrawal % atm.banknoteDenomination100;
                int remainder50 = remainder100 % atm.banknoteDenomination50;
                int remainder20 = remainder50 % atm.banknoteDenomination20;

                int numberOfBanknotes100 = cashWithdrawal / atm.banknoteDenomination100;
                int numberOfBanknotes50 = remainder100 / atm.banknoteDenomination50;
                int numberOfBanknotes20 = remainder50 / atm.banknoteDenomination20;

                if (remainder20 == 0) {
                    System.out.println("Операция прошла успешно! " + "\n" + "Купюры номиналом 100: " + numberOfBanknotes100 + "\n" + "Купюры номиналом 50: " + numberOfBanknotes50 + "\n" + "Купюры номиналом 20: " + numberOfBanknotes20 + "\n" + "Остаток на карте: " + remainder + "$");
                    success = true;
                } else {
                    System.out.println("Операция не выполнена, повторите попытку");
                }
            } else {
                System.out.println("Операция не выполнена, повторите попытку");
            }
        } while (!success);
    }
}