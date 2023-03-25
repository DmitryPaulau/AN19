package lesson8.accountingOfDocuments.FinancialInvoice;

import lesson8.accountingOfDocuments.Document;

public class FinancialInvoice extends Document {
    private int monthlyTotal;
    private String documentDate;
    private String departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(String documentNumber, int monthlyTotal, String documentDate, String departmentCode) {
        super(documentNumber);
        this.monthlyTotal = monthlyTotal;
        this.documentDate = documentDate;
        this.departmentCode = departmentCode;
    }

    @Override
    public void show() {
        System.out.println("Всего за месяц: " + monthlyTotal + "\n" + "Дата документа: " + documentDate + "\n" + "Номер документа: " + getDocumentNumber() + "\n" + "Код департамента: " + departmentCode);
    }
}
