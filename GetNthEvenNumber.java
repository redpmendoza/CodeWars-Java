public class GetNthEvenNumber{
  public static int nthEven(int n){
    
    // Start of Solution
    int even = -2;
    
    for(int ctr = 0; ctr < n; ctr++){
      even += 2;
    }
    
    return even;
    // End of Solution
    
  }
}
