public class SimpleFunInviteMoreWomen{
    public static boolean inviteMoreWomen(int[] l){
        
      // Start of Solution
      int women = 0, men = 0;
      
      for(int ctr = 0; ctr < l.length; ctr++){
        if(l[ctr] == -1){
          women++;
        }
        else{
          men++;
        }
      }
      
      if(women < men){
        return true;
      }
      else{
        return false;
      }
      // End of Solution
      
    }
}
