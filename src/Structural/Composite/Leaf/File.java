package Structural.Composite.Leaf;

import Structural.Composite.Component.FileSystemElement;

public class File implements FileSystemElement {
    private String fileName;
    private int size;

    public File(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.printf(indent + "File name: %s\n", fileName);
    }

    @Override
    public int getSize() {
        return size;
    }
}
