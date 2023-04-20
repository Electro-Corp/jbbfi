package compiler.Parser;
public enum Codes {
  // DATA TYPES
  DATA_DEF_INT("int"),
  DATA_DEF_FLOAT("float"), 
  DATA_DEF_STRING("string"),

  // actuall data
  VALUE_DEF_INT("\\d+")

   private final int number;
   Codes(int number) { 
       this.number = number;
   }
}