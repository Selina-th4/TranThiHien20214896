package hust.soict.dsai.garbage;
import java.util.Random;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "/Users/tranhien/Downloads/OOP-Lab03-BasicOOTechniques.docx";
        byte[] inputBytes = {0};
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        startTime = System.currentTimeMillis();
        StringBuilder outputBuilder = new StringBuilder();
        for (byte b: inputBytes) {
            outputBuilder.append((char)b);
        }
        String outputString = outputBuilder.toString();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
