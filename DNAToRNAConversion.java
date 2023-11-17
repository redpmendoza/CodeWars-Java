public class DNAToRNAConversion{
    public String dnaToRna(String dna){
      
      // Start of Solution
      String out = "";
      
      for(int ctr = 0; ctr < dna.length(); ctr++){
        if((dna.charAt(ctr) + "").equals("T")){
          out += "U";
        }
        else{
          out += dna.charAt(ctr) + "";
        }
      }
      
      return out;
      // End of Solution
      
    } 
}
