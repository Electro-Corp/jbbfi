// file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
//
import compiler.Parser.*;
public class Main{
  public static void main(String[] args){
  String data = "";
  try {
      File file = new File(args[0]);
      Scanner fileRead = new Scanner(file);
      while (fileRead.hasNextLine()) {
        data += fileRead.nextLine();
      }
      fileRead.close();
    } catch (FileNotFoundException e) {
      System.out.println("The requested file was not found.");
    }
    // Prase file
    Parser passOne = new Parser(data);
  }
}