import java.util.Scanner;
import java.util.*;
// import runtime.includes.GenType;
import java.io.*;

public class JVM {
  private int sp, ip, fp;
  private Deque<Object> f = new ArrayDeque<>();

  public static void main(String[] args) {
    new JVM();
  }

  public JVM() {
    System.out.println("Started Virtual Machine");
    try {
    File file = new File("default.jbbji++xlprot2");
    Scanner in = new Scanner(file);

    System.out.println("File found, reading");
      
    while(in.hasNextLine()) {
      String code = in.nextLine();
      parseByteCode(code);
    }
    in.close();
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public JVM(String filename) {
    File in = new File(filename);
  }

  public int parseByteCode(String s) {
    if(s.substring(0,2).equals("//"))
      return -1;
    if (s.charAt(0) == 's')
      parseStackCode(s);
    return 0;
  }

  
  public int parseStackCode(String s) {
    
    
    return 0;
  }
}