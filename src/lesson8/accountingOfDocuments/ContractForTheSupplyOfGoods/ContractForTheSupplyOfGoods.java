package lesson8.accountingOfDocuments.ContractForTheSupplyOfGoods;


import lesson8.accountingOfDocuments.Document;

public class ContractForTheSupplyOfGoods extends Document {

    private String productType;
    private int numberOfGoods;

    public ContractForTheSupplyOfGoods() {
    }

    public ContractForTheSupplyOfGoods(String productType, int numberOfGoods) {
        this.productType = productType;
        this.numberOfGoods = numberOfGoods;
    }

    public ContractForTheSupplyOfGoods(String documentNumber, String productType, int numberOfGoods) {
        super(documentNumber);
        this.productType = productType;
        this.numberOfGoods = numberOfGoods;
    }

    public ContractForTheSupplyOfGoods(String documentNumber, String documentDate, String productType, int numberOfGoods) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.numberOfGoods = numberOfGoods;
    }

    @Override
    public void show() {
        System.out.println("Номер документа: " + getDocumentNumber() + "\n" + "Тип продукта: " + productType + "\n" + "Количество товаров: " + numberOfGoods + "\n" + "Дата документа: " + getDocumentDate());

    }
}



