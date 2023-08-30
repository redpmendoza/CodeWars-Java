public class FindTheSmallestIntegerInTheArray{
    public static int findSmallestInt(int[] args){

      // Start of Solution
      int smallest = args[0];
      
      for(int ctr = 0; ctr <  args.length; ctr++){
        smallest = Math.min(smallest, args[ctr]);
      }
      
      return smallest;
      // End of Solution
      
    }
}
