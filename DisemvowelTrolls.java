public class DisemvowelTrolls{
    public static String disemvowel(String str){

      // Start of Solution
      String out = "";
      
      for(int ctr = 0; ctr < str.length(); ctr++){
        String let = str.charAt(ctr) + "";
        switch(let){
            case "A": case "a": case "E": case "e": case "I": case "i": case "O": case "o": case "U": case "u":
            break;
            default:
              out += let + "";
            break;
        }
      }
      
      return out;
      // End of Solution
      
    }
}
