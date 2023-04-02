package lesson8.accountingOfDocuments;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Register {

    List<Document> registerList = new ArrayList<>();

    public void saveDocument(Document contract) {
        registerList.add(contract);
    }

    public void documentDisplay(String number) {
        boolean examination = false;
        for (Document document : registerList) {
            if (Objects.equals(document.getDocumentNumber(), number)) {
                examination = true;
                document.show();
            }
        }
        if (!examination) {
            System.out.println("Документ не найден");
        }
    }
}

