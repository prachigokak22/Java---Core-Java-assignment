import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        String fileName = "data.txt";

        // 🔹 Writing to file
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Hello Prachi!\n");
            fw.write("This is file handling in Java.\n");
            fw.write("Learning FileReader and FileWriter.");
            fw.close();

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e);
        }

        //  Reading from file
        try {
            FileReader fr = new FileReader(fileName);
            int ch;

            System.out.println("\nReading file content:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}