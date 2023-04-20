package runtime.includes;

import runtime.includes.*;
  
public abstract class ByteCode {
  private Codes code_type;
  
  String[] split_code;
  public ByteCode(String code) {
    split_code = code.split("_");
    start();
  }

  public abstract void start();
}