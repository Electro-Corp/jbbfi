package compiler.Parser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;
import java.util.ArrayList;
public class Parser{
  private String data;
  ArrayList<Pattern> compiledPatterns = new ArrayList<>();
  public Parser(String data){
    this.data = data;
    this.initCode();
    this.parse();
  }
  public void parse(){
    ArrayList<String> parts = new ArrayList<>(Arrays.asList(data.split(";")));
    ArrayList<ArrayList<String>> lines = new ArrayList<>();
    for(String s : parts){
      lines.add(new ArrayList<>(Arrays.asList(s.split(" "))));
    }
    
      for(String h : parts){
        // CHECK CODE
        code(h);
      }
  }
  public void initCodes(){
    for(Codes c: Codes.values()){
      Pattern pattern = Pattern.compile(c);
      compiledPatterns.add(pattern);
    }
  }
  public void code(String h){
    // check if data type
    // if the first value is a raw data
    for(int i = 0; i < compiledPatterns.size(); i++){
      Matcher matcher = compiledPatterns.get(i).matcher(h);
      StringBuilder result = new StringBuilder();
      while (matcher.find()) {                                                
          result.append("[");
          result.append(matcher.group(1));
          result.append(":");
          result.append(matcher.group(2));
          result.append("]");
      }
      System.out.println(result.toString());
    }
  }
}