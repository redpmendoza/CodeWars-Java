public class ArrayPlusArray{
  public static int arrayPlusArray(int[] arr1, int[] arr2){
    
    // Start of Solution
    int size = arr1.length;
    int sum = 0;
    
    for(int ctr = 0; ctr < size; ctr++){
      sum += (arr1[ctr] + arr2[ctr]);
    }
    
    return sum;
    // End of Solution
    
  }
}
