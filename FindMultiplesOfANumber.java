public class FindMultiplesOfANumber{
    public static int[] find(int base, int limit){
        
      // Start of Solution
      int index = 0;
      
      for(int ctr = base; ctr <= limit; ctr+=base){
        index++;
      }
      
      int arr[] = new int[index];
      index = 0;
      
      for(int ctr = base; ctr <= limit; ctr+=base){
        arr[index] = ctr;
        index++;
      }
      
      return arr;
      // End of Solution
      
    }
}
