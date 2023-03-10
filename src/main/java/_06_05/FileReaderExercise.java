package _06_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))) {
            return reader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            reader.lines().forEach(stringBuilder::append);
            return stringBuilder.toString();
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;

    }

}
