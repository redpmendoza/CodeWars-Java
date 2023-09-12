public class CatYearsDogYears{
  public static int[] humanYearsCatYearsDogYears(final int humanYears){

    // Start of Solution
    int cat = 0, dog = 0;
    
    if(humanYears > 0){
      cat+=15;
      dog+=15;
    }
    if(humanYears > 1){
      cat+=9;
      dog+=9;
    }
    if(humanYears > 2){
      int human = humanYears - 2;
      cat = cat + (human * 4);
      dog = dog + (human * 5);
    }
    
    return new int[]{humanYears, cat, dog};
    // End of Solution

  }
}
