public class ReservedSequence{
  public static int[] reverse(int n){
    
    // Start of Solution
    int arr[] = new int[n];
    
    for(int ctr = 0; ctr < n; ctr++){
      arr[ctr] = n - ctr;
    }
    
    return arr;
    // End of Solution
    
  }
}
