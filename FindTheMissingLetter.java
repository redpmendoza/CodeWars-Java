public class FindTheMissingLetter{
  public static char findMissingLetter(char[] array){
    
    // Start of Solution
    char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    int start = 0;
    char missing = ' ';
		
		for(int ctr = 0; ctr < 26; ctr++){
		    if(Character.toLowerCase(array[0]) == letters[ctr]){
		        start = ctr;
		    }
		}
		
		for(int ctr = 0; ctr < array.length; ctr++){
		    if(Character.toLowerCase(array[ctr]) != letters[start + ctr]){
		        missing = letters[start + ctr];
		        break;
		    }
		}
    
    if(Character.isUpperCase(array[0])){
      missing = Character.toUpperCase(missing);
    }
    
    return missing;
    // End of Solution
    
  }
}
