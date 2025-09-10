package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        StringBuilder result = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/ReadFile/src/readfile.txt"))) {
        //try (BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\src\\ReadFile\\src\\readfile.txt"))) {
        //try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\JAVA2\\Temp1\\src\\ReadFile\\src\\readfile.txt"))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
                result.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

}
