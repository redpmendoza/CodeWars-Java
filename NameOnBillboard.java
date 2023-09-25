public class NameOnBillboard{
	public static int billboard(String name, int price){

    // Start of Solution
    int total = 0;
    int size = name.length();
    
    for(int ctr = 0; ctr <  size; ctr++){
      total += price;
    }
    
    return total;
    // End of Solution
    
  }
}
