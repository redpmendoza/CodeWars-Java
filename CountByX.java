public class CountByX{
  public static int[] countBy(int x, int n){
    
    // Start of Solution
    int arr[] = new int[n];
    int ind = 0;
    
    for(int ctr = 1; ctr <= n; ctr++){
        arr[ind] = x * ctr;
        ind++;
    }
    
    return arr;
    // End of Solution
    
  }
}
