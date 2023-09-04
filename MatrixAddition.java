public class MatrixAddition{
	public static int[][] matrixAddition(int[][] a, int[][] b){
    
    // Start of Solution
    int size = a.length;
    int arr[][] = new int[size][size];
    
    for(int ctr = 0; ctr < size; ctr++){
      for(int ctr2 = 0; ctr2 < size; ctr2++){
        arr[ctr][ctr2] = a[ctr][ctr2] + b[ctr][ctr2];
      }
    }
    
    return arr;
    // End of Solution
     
	}
}
