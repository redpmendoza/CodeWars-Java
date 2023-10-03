public class DoIGetABonus{
  public static String bonusTime(final int salary, final boolean bonus){
    
    // Start of Solution
    if(bonus){
      return "\u00A3" + (salary * 10);
    }
    else{
      return "\u00A3" + salary;
    }
    // End of Solution
    
  }
}
