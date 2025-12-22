package Structural.Composite.Composite;

import Structural.Composite.Component.FileSystemElement;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void add(FileSystemElement element){
        files.add(element);
    }

    public void remove(FileSystemElement element){
        files.remove(element);
    }

    @Override
    public void showDetails(String indent) {
        System.out.printf("%sDirectory name: %s\n", indent, name); // Додано \n та виправлено формат
        for (FileSystemElement element : files) {
            element.showDetails(indent + "  ");
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemElement child : files) {
            totalSize += child.getSize();
        }
        return totalSize;
    }
}
