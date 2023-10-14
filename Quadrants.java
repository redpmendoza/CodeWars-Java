public class Quadrants{
  public static int quadrant(int x, int y){
    
    // Start of Solution
    if(x > 0 && y > 0){
      return 1;
    }
    else if(x < 0 && y > 0){
      return 2;
    }
    else if(x < 0 && y < 0){
      return 3;
    }
    
    return 4;
    // End of Solution
    
  }
}
