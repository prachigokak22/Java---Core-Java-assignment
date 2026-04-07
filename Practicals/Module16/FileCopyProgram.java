
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {
    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        try {
            FileOutputStream fout = new FileOutputStream("source.txt");
            String s= "Hello Prachi\nThis is source file\nFile copy program";
            byte b[]= s.getBytes();

            fout.write(b);
            
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}