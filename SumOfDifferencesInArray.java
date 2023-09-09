public class SumOfDifferencesInArray{
  public static int sumOfDifferences(int[] arr){
    
    // Start of Solution
    int size = arr.length;
    
    if(size <= 1){
      return 0;
    }
    
    int temp = 0, sum = 0;
    
    for(int ctr = 0; ctr < size; ctr++){
      for(int ctr2 = ctr; ctr2 < size; ctr2++){
        if(arr[ctr] < arr[ctr2]){
          temp = arr[ctr];
          arr[ctr] = arr[ctr2];
          arr[ctr2] = temp;
        }
      }
    }
    
    for(int ctr = 0; ctr < size - 1; ctr++){
      sum += (arr[ctr] - arr[ctr + 1]);
    }
    
    return sum;
    // End of Solution
    
  }
}
