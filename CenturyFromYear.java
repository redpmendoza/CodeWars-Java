public class CenturyFromYear{
  public static int century(int number){
    
	  // Start of Solution
	  if(number % 100 == 0){
	      return number/100;
	  }
	  else{
	      return ((number/100) + 1);
	  }
    // End of Solution
    
  }
}
