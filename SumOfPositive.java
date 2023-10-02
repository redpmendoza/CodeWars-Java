public class SumOfPositive{
  public static int sum(int[] arr){
    
    // Start of Solution
    int sum = 0;
    
    for(int ctr = 0; ctr < arr.length; ctr++){
      if(arr[ctr] > 0){
        sum += arr[ctr];
      }
    }
    
    return sum;
    // End of Solution
    
  }
}
