public class TotalAmountOfPoints{
    public static int points(String[] games){
    
      // Start of Solution
      int team = 0, oppon = 0, score = 0;
      
      for(int ctr = 0; ctr < 10; ctr++){
        String match = games[ctr] + "";
        team = Integer.parseInt(match.charAt(0) + "");
        oppon = Integer.parseInt(match.charAt(2) + "");
        
        if(team > oppon){
          score+=3;
        }
        else if(team == oppon){
          score++;
        }
      }
      
      return score;
      // End of Solution
      
    }
}
