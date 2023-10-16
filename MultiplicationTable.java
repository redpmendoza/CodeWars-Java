class MultiplicationTable{
    public static String multiTable(int num){

      // Start of Solution
      String output = "";
      
      for(int ctr =  1; ctr <= 10; ctr++){
        output += ctr + " * " + num + " = " + (ctr * num);   
        if(ctr != 10){
            output += "\n";
        }
      }
      
      return output;
      // End of Solution
      
    }
}
