public class AbbreviateATwoWordName{
  public static String abbrevName(String name){
    
    // Start of Solution
    int ind = name.indexOf(' ');
    String output = (name.charAt(0) + "").toUpperCase() + "." + (name.charAt(ind + 1) + "").toUpperCase();
    
    return output;
    // End of Solution
    
  }
}
