package lesson8.accountingOfDocuments;

import java.util.Date;

public abstract class Document {
    private String documentNumber;
    private String documentDate;

    public Document() {
    }

    public Document(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Document(String documentNumber, String documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public abstract void show();


}


