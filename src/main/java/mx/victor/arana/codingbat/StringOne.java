package mx.victor.arana.codingbat;

public class StringOne {
	
	/**
	 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". 
	 * @param name
	 * @return
	 */
	public static String helloName(String name) {
		return "Hello " + name + "!";
	}

	/**
	 * Given two strings, a and b, return the result of putting them together 
	 * in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 * @param a
	 * @param b
	 * @return
	 */
	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}
	
	/**
     * Given tag and word strings, create the HTML string with tags around the 
     * word, e.g. "<i>Yay</i>".
	 */
	public static String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public static String altPairs(String str) {
		String res = "";
		int l = str.length();
		for(int i = 0; i <= ( l - l%4); i = i + 4){
			int cnt = 1;
			while( ((cnt >= 1 ) && (cnt <= 4)) && ((cnt + i) <= l)){
				if((cnt >= 1)&&(cnt <=2)){
					res = res + str.charAt(i + cnt - 1);
				}
				cnt = cnt + 1;
			}
		}
		return res;		
	}

	/*
	     * Given a string, return a version where all the "x" have been removed. Except an "x" at the
	     * very start or end should not be removed.
	     *
	     */
	    
	    public static String stringX(String str){
	    	
	    	String result = "";
	  for (int i=0; i<str.length(); i++) {
	    // Only append the char if it is not the "x" case
	    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
	      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
	    }
	  }
	  return result;
	    	/*
	    	 String start = "";
	    	String end= "";    	
	    	
	    	if(str.length() > 1){
	    	
		    	if( str.indexOf('x') == 0 && str.lastIndexOf('x') == str.length()-1 ){
		    		start = "x";
		    		end = "x";
		    	}
	    	
	    	
		    	while( str.indexOf('x')!= -1){
		    		int index = str.indexOf('x');
		    		str = str.substring(0,index) + str.substring(index + 1);
		    	}
	    	}
	    	
	    	return start + str + end;
	    	*/    
	    }

		/*
		 * Given a string, return a version where all the "x" have been removed. Except an "x" at the
		 * very start or end should not be removed.
		 *
		 */
		
		public static String stringYak(String str) {
			
			int l = str.length();
			String res = "";
				
			for(int i = 0; i < l; i++){
				
				if( i <= l - 3){
					if(!str.substring(i,i+3).equals("yak")){
					res = res + str.charAt(i);
					} else {
					i = i + 2;
					}
				} else{
				  res = res + str.charAt(i); 	
				}		
			}		
			return res; 
		}


	

}
