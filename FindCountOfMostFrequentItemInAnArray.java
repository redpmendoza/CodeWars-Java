public class FindCountOfMostFrequentItemInAnArray{
  public static int mostFrequentItemCount(int[] collection){
    
    // Start of Solution
    int total = 0;
    
    for(int ctr = 0; ctr < collection.length; ctr++){
      int num = collection[ctr];
      int count = 0;
      
      for(int ctr2 = 0; ctr2 < collection.length; ctr2++){
        if(num == collection[ctr2]){
          count++;
        }
      }
      
      total = Math.max(total, count);
    }
    
    return total;
    // End of Solution
    
  }
}
