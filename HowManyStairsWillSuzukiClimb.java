public class HowManyStairsWillSuzukiClimb{
    public static long stairsIn20(int[][] stairs){
      
      // Start of Solution
      int sum = 0;
      
      for(int ctr = 0; ctr < stairs.length; ctr++){
        for(int ctr2 = 0; ctr2 < stairs[ctr].length; ctr2++){
          sum += stairs[ctr][ctr2];
        }
      }
      
      return sum * 20;
       //code here
      
    }
}
