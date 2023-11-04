public class ToSquareOrNotToSquare{
  public static int[] squareOrSquareRoot(int[] array){
    
    // Start of Solution 
	  int out[] = new int[array.length];
	  boolean check = false;
    
    for(int ctr = 0; ctr < array.length; ctr++){
        check = false;
        for(int ctr2 = 1; ctr2 <= array[ctr]; ctr2++){
            if(ctr2 * ctr2 == array[ctr]){
                out[ctr] = ctr2;
                check = true;
            }
        }
        if(check == false){
            out[ctr] = array[ctr] * array[ctr];
        }
    }
    
    return out;
    // End of Solution
    
  }
}
