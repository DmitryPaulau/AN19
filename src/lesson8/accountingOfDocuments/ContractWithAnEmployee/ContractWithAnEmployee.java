package lesson8.accountingOfDocuments.ContractWithAnEmployee;

import lesson8.accountingOfDocuments.Document;

public class ContractWithAnEmployee extends Document {
    private String contractEndDate;
    private String employeeName;

    public ContractWithAnEmployee() {
    }

    public ContractWithAnEmployee(String contractEndDate, String employeeName) {
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    public ContractWithAnEmployee(String documentNumber, String contractEndDate, String employeeName) {
        super(documentNumber);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    public ContractWithAnEmployee(String documentNumber, String documentDate, String contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public void show() {
        System.out.println("Номер документа: " + getDocumentNumber() + "\n" + "Дата документа: " + getDocumentDate() + "\n" + "Дата окончания контракта" + contractEndDate + "\n" + "Имя сотрудника: " + employeeName);
    }
}

