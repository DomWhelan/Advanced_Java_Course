package _07_05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExercise {

    public static void main(String[] args) {
        // Create a new empty file called example.txt inside folderA
        Path pathToFolderA = Paths.get("src/main/java/_07_05/folderA");
        Path pathToExampleFile = Paths.get("src/main/java/_07_05/folderA/example.txt");

        try {
            if(Files.notExists(pathToFolderA)) {
                Files.createDirectory(pathToFolderA);
            }
            if(Files.notExists(pathToExampleFile)) {
                Files.createFile(pathToExampleFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Copy the file to folderB
        Path pathToFolderB = Paths.get("src/main/java/_07_05/folderB");
        Path pathToCopiedFile = Paths.get("src/main/java/_07_05/folderB/example.txt");
        try {
            if(Files.notExists(pathToFolderB)) {
                Files.createDirectory(pathToFolderB);
            }
            if(Files.notExists(pathToCopiedFile)) {
                Files.createFile(pathToCopiedFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // List the contents of folderB to check that your file is in there
        try{
            Files.list(pathToFolderB).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
