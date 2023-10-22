public class IsItANumber{
  public boolean isDigit(String s){
    
    // Start of Solution
    boolean check = false;
    
    try{
      float a = Float.valueOf(s);
      check = true;
    }
    catch(Exception e){}
    
    return check;
    // End of Solution
    
  }
}
