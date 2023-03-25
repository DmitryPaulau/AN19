package lesson8.accountingOfDocuments.ContractForTheSupplyOfGoods;


import lesson8.accountingOfDocuments.Document;

public class ContractForTheSupplyOfGoods extends Document {

    private String productType;
    private int numberOfGoods;
    private String documentDate;

    public ContractForTheSupplyOfGoods() {
    }

    public ContractForTheSupplyOfGoods(String documentNumber, String productType, int numberOfGoods, String documentDate) {
        super(documentNumber);
        this.productType = productType;
        this.numberOfGoods = numberOfGoods;
        this.documentDate = documentDate;
    }

    @Override
    public void show() {
        System.out.println("Номер документа: " + getDocumentNumber() + "\n" + "Тип продукта: " + productType + "\n" + "Количество товаров: " + numberOfGoods + "\n" + "Дата документа: " + documentDate);

    }
}



