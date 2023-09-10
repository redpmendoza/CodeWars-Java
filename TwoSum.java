public class TwoSum{
    public static int[] twoSum(int[] numbers, int target){
      
      // Start of Solution
      int size = numbers.length;
      int ind[] = new int[2];
      
      for(int ctr = 0; ctr < size; ctr++){
        for(int ctr2 = 0; ctr2 < size; ctr2++){
          
          if(ctr != ctr2){
            int sum = numbers[ctr] + numbers[ctr2];
            
            if(sum == target){
              ind[0] = ctr;
              ind[1] = ctr2;
            }
          }
        }
      }
      
      return ind;
      // End of Solution

    }
}
