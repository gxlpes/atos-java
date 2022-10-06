package ex03_polimorfismo.ex02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter; 
import java.util.Scanner;


public class FileAction extends Dados {

    public void createFile() {
      try {
        File myObj = new File(nome + ".txt");
        if (myObj.createNewFile()) {
          System.out.println("File created: " + myObj.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }

  public void writeFile() {
    try {
      FileWriter myWriter = new FileWriter(nome + ".txt");
      myWriter.write(nome + " " + email);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public void readFile(){
    try {
      File myObj = new File(nome + ".txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
  
