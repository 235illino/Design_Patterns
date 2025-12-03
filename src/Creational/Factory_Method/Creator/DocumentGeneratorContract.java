package Creational.Factory_Method.Creator;

import Creational.Factory_Method.Product.Contract;
import Creational.Factory_Method.Product.Document;

public class DocumentGeneratorContract extends DocumentGenerator{
    @Override
    Document createDocument() {
        return new Contract();
    }
}
