package lesson8.accountingOfDocuments.ContractWithAnEmployee;

import lesson8.accountingOfDocuments.Document;

public class ContractWithAnEmployee extends Document {
    private String documentDate;
    private String contractEndDate;
    private String employeeName;

    public ContractWithAnEmployee() {
    }

    public ContractWithAnEmployee(String documentNumber, String documentDate, String contractEndDate, String employeeName) {
        super(documentNumber);
        this.documentDate = documentDate;
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public void show() {
        System.out.println("Номер документа: " + getDocumentNumber() + "\n" + "Дата документа: " + documentDate + "\n" + "Дата окончания контракта" + contractEndDate + "\n" + "Имя сотрудника: " + employeeName);
    }
}

