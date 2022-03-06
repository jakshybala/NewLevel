package AlphabetTask22;

import java.io.*;
import java.util.Scanner;

public class MainAlphabet {
    public static void main(String[] args) {
        try (FileWriter writerObj = new FileWriter("c:\\text.txt")) {
            System.out.println("File write! Successful!!!");
            for (char chars = 'A'; chars < 'Z'; chars++) {
                writerObj.write(chars + "" + Character.toLowerCase(chars) + " \n");
            }
            int numbers = 0;
            for (int i = 0; i < 10; i++) {
                writerObj.write(i + " \n");
            }
        } catch (IOException e) {
            System.out.println("Something wron! Check Write class");
        }

        try (FileReader readerObj = new FileReader("c:\\text.txt")){

            Scanner readData = new Scanner(readerObj);
            int counter = 0;
            while (readData.hasNextLine()) {
                System.out.print(counter++ + ": " + readData.nextLine() + " \n" );
            }
            System.out.println("Read file Successful");
        } catch (FileNotFoundException e) {
            System.out.println("Not foud fille!!! Message");
        } catch (IOException e) {
            System.out.println("Something wron! Check Reade class");

        }

    }
}
