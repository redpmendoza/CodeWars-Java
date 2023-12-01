public class AlternatingCase{
  public static String toAlternativeString(String string){
    
    // Start of Solution
    String out = "";
    
    for(int ctr = 0; ctr < string.length(); ctr++){
      char let = string.charAt(ctr);
      
      if(Character.isLowerCase(let)){
        out += (let + "").toUpperCase();
      }
      else{
        out += (let + "").toLowerCase();
      }
    }
    
    return out;
    // End of Solution
    
  }
}
