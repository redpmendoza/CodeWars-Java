public class SimpleStringCharacters{
    public static int[] Solve(String word){

      // Start of Solution
      int upper = 0, lower = 0, digit = 0, special = 0;
      
      for(int ctr = 0; ctr < word.length(); ctr++){ 
        char x = word.charAt(ctr);
        
        if(Character.isLetter(x)){
          if(Character.isUpperCase(x)){
            upper++;
          }
          else{
            lower++;
          }
        }
        else if(Character.isDigit(x)){
          digit++;
        }
        else{
          special++;
        }
      }
      
      int arr[] = {upper, lower, digit, special};
      
      return arr;
      // End of Solution
      
    }
}
