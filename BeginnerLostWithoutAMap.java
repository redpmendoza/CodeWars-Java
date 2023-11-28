public class BeginnerLostWithoutAMap{
  public static int[] map(int[] arr){

    // Start of Solution
    int array[] = new int[arr.length];
    
    for(int ctr = 0; ctr < arr.length; ctr++){
      array[ctr] = arr[ctr] + arr[ctr];
    }
    
    return array;
    // End of Solution
    
  }
}
