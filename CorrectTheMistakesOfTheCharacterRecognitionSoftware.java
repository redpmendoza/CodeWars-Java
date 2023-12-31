public class CorrectTheMistakesOfTheCharacterRecognitionSoftware{
  public static String correct(String string){
    
    // Start of Solution
    String out = "";
    
    for(int ctr = 0; ctr < string.length(); ctr++){
      String let = string.charAt(ctr) + "";
      
      if(let.equals("5")){
        out += "S";
      }
      else if(let.equals("0")){
        out += "O";
      }
      else if(let.equals("1")){
        out += "I";
      }
      else{
        out += let;
      }
    }
    
    return out;
    // End of Solution
    
  }
}
