package lesson8.accountingOfDocuments;

import java.util.Date;

public abstract class Document {
    private String documentNumber;

    public Document() {
    }

    public Document(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public abstract void show();


}


