package Creational.Factory_Method.Creator;

import Creational.Factory_Method.Product.Document;

public abstract class DocumentGenerator {

    abstract Document createDocument();

    public void print(){
        System.out.println("друк документа: " + createDocument().getNameOfDocument());
    }
}
