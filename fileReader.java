package orgProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileReader {
    public static void main(String[] args) {
        File txtFile = new File("C:/Users/wolfe/Documents/testTXT/AnimalTest.txt"); // change for file name
        try (Scanner readFile = new Scanner(txtFile)){
            while (readFile.hasNextLine()){
                String data = readFile.nextLine();
                String[] txtLine = data.split(" ");
                System.out.println(txtLine);
                }
            }
                catch (FileNotFoundException e){
                    System.out.println("error occured");
                    e.printStackTrace();
                }
    
    }
}