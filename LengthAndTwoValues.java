public class LengthAndTwoValues{
  public static String[] alternate(int n, String firstValue, String secondValue){
    
    // Start of Solution
    String arr[] = new String[n];
    
    for(int ctr = 0; ctr < n; ctr++){
      if(ctr % 2 != 0){
        arr[ctr] = secondValue;
      }
      else{
        arr[ctr] = firstValue;
      }
    }
    
    return arr;
    // End of Solution
    
  }
}
