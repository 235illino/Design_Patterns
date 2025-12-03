package Creational.Factory_Method.Creator;

import Creational.Factory_Method.Product.Document;
import Creational.Factory_Method.Product.Report;

public class DocumentGeneratorReport extends DocumentGenerator{

    @Override
    Document createDocument() {
        return new Report();
    }
}
