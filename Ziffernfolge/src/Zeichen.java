
public class Zeichen {
	    public static boolean überprüfeSymmetrie(String s){
	    	
	        boolean isEmpty = s.length()==0;
			boolean isSingleChar = s.length()==1;
			
			boolean isEmptyOrSingleChar = isEmpty || isSingleChar;
			
			if (isEmptyOrSingleChar) return true;
	        
			String noFirstNoLast = s.substring(1, s.length()-1);
			
			boolean prevResult = überprüfeSymmetrie(noFirstNoLast);
			
			char firstChar = s.charAt(0);
			char lastChar = s.charAt(s.length()-1);
			
			boolean result = prevResult && (firstChar==lastChar);
			
			return result;
	    }
	        
 public static String umdrehen(String s){
	    	
	        boolean isEmpty = s.length()==0;
			boolean isSingleChar = s.length()==1;
			
			boolean isEmptyOrSingleChar = isEmpty || isSingleChar;
			
			if (isEmptyOrSingleChar) return s;
			
			char firstChar= s.charAt(0);
			char lastChar= s.charAt(s.length()-1);
			String noFirstNoLast = s.substring(1, s.length()-1);
			
	        String result= lastChar+umdrehen(noFirstNoLast)+firstChar;
			
	        return result;
	    }
 
 public static boolean einfachSymmetrieUeberpruefen(String s){
	 String newS = umdrehen(s);
	 if(newS.equals(s)) return true;
	 return false;
 }
	    
	public static void main(String[] args){
		System.out.println(Zeichen.einfachSymmetrieUeberpruefen("HALLO"));
		System.out.println(Zeichen.umdrehen("HALLO"));
		System.out.println(Zeichen.einfachSymmetrieUeberpruefen("OTTO"));
	}	 
}
