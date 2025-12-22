package Structural.Composite;

import Structural.Composite.Composite.Directory;
import Structural.Composite.Leaf.File;

public class Client {
    static void main() {
        File file1 = new File("File1.txt", 100);
        File file2 = new File("image.png", 500);
        Directory documents = new Directory("Documents");
        documents.add(file1);
        documents.add(file2);
        Directory video = new Directory("Video");
        video.add(new File("movie.mp4", 2000));
        Directory root = new Directory("Root");
        root.add(documents);
        root.add(video);
        root.showDetails("");
        System.out.println("\nЗагальний розмір диска: " + root.getSize() + " KB");
    }
}
