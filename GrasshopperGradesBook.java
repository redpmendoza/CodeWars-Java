public class GrasshopperGradesBook{
    public static char getGrade(int s1, int s2, int s3){
  
      // Start of Solution
      int score = (s1 + s2 + s3) / 3;
      
      if(score >= 90 && score <= 100){
        return 'A';
      }
      else if(score >= 80 && score < 90){
        return 'B';
      }
      else if(score >= 70 && score < 80){
        return 'C';
      }
      else if(score >= 60 && score < 70){
        return 'D';
      }
      
      return 'F';
      // End of Solution

    }
}
