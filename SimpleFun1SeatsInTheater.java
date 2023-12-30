public class SimpleFun1SeatsInTheater{
  public static int seatsInTheater(int nCols, int nRows, int col, int row){
  
    // Start of Solution
    return (nRows - row) * (nCols - (col - 1));
    // End of Solution
    
  }
}
