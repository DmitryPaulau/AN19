package lesson8.accountingOfDocuments;

import lesson8.accountingOfDocuments.ContractForTheSupplyOfGoods.ContractForTheSupplyOfGoods;
import lesson8.accountingOfDocuments.ContractWithAnEmployee.ContractWithAnEmployee;
import lesson8.accountingOfDocuments.FinancialInvoice.FinancialInvoice;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        ContractForTheSupplyOfGoods contractForTheSupplyOfGoods = new ContractForTheSupplyOfGoods("541", "15.11.22", "Milk", 15);
        register.saveDocument(contractForTheSupplyOfGoods);
        ContractWithAnEmployee contractWithAnEmployee = new ContractWithAnEmployee("3", "15.07.1954", "14.07.2025", "Миша");
        register.saveDocument(contractWithAnEmployee);
        FinancialInvoice financialInvoice = new FinancialInvoice("177a","14.03.23" , 81, "15");
        register.saveDocument(financialInvoice);

        register.documentDisplay("541");
    }
}
