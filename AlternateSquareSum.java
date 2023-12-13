public class AlternateSquareSum{
  public static int alternateSqSum(int[] arr){
    
    // Start of Solution
    int sum = 0;
    
    for(int ctr = 0; ctr < arr.length; ctr++){
      if(ctr % 2 == 0){
        sum += arr[ctr];
      }
      else{
        sum += arr[ctr] * arr[ctr];
      }
    }
    
    return sum;
    // End of Solution
    
  }
} 
