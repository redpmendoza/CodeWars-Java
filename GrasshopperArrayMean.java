public class GrasshopperArrayMean{
    public static int findAverage(int[] nums){
      
      // Start of Solution
      int ave = 0;
      
      for(int ctr = 0; ctr < nums.length; ctr++){
        ave += nums[ctr];
      }
      
      return ave / nums.length;
      // End of Solution
      
    }
}
