public class QuarterOfTheYear{
    public static int quarterOf(int month){
      
      // Start of Solution
      int q = 0;
      
      switch(month){
          case 1: case 2: case 3:
            q = 1;
          break;
          case 4: case 5: case 6:
            q = 2;
          break;
          case 7: case 8: case 9:
            q = 3;
          break;
          case 10: case 11: case 12:
            q = 4;
          break;
      }
      
      return q;
      // End of Solution
      
    }
}
