package lesson8.accountingOfDocuments.FinancialInvoice;

import lesson8.accountingOfDocuments.Document;

public class FinancialInvoice extends Document {
    private int monthlyTotal;
    private String departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int monthlyTotal, String departmentCode) {
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice(String documentNumber, int monthlyTotal, String departmentCode) {
        super(documentNumber);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice(String documentNumber, String documentDate, int monthlyTotal, String departmentCode) {
        super(documentNumber, documentDate);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    public void show() {
        System.out.println("Всего за месяц: " + monthlyTotal + "\n" + "Дата документа: " + getDocumentDate() + "\n" + "Номер документа: " + getDocumentNumber() + "\n" + "Код департамента: " + departmentCode);
    }
}
