public class FalseOption extends Main {


public static void throwThis(int throwNum) throws Exception {
    throw new Exception("Number is not one of the options "  + throwNum);
  }

  public static void catchThis(int catchMi) {
    try {
      throwThis(catchMi);
    } catch (Exception e) {
      
    } 
    
  }

}