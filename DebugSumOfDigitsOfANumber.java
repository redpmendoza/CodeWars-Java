public class DebugSumOfDigitsOfANumber{
  public static int sumOfDigits(int n){
    
    // Start of Solution
    String num = n + "";
    int sum = 0;
    
    for(int ctr = 0; ctr < num.length(); ctr++){
      sum += Integer.valueOf(num.charAt(ctr) + "");
    }
    
    return sum;
    // End of Solution
    
  }
}
