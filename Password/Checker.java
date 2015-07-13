
public class Checker {
	
	private boolean status;
	
	public boolean hasCap(String word){
		for(int i=word.length()-1; i>=0; i--){
			if(Character.isUpperCase(word.charAt(i))) {
				return true;
			}
			else {
				status = false;
			}
		}
		return status;
		
			
	}
	
	public boolean hasNum(String word){
		for(int i=word.length()-1; i>=0; i--){
			if(Character.isDigit(word.charAt(i))) {
				return true;
			}
			else {
				status = false;
			}
		}
		return status;
	}
	
		
	public boolean hasLength(String word){
		if(word.length() > 5) {
			return true;
		}
		else{
			return false;
			
		}
		
	}
	
	public boolean isOriginal(String word){
		switch(word) {
		case "iloveyou":
			return false;
		case "password":
			return false;
		case "abc123":
			return false;
		case "123456":
			return false;
		case "mcprogramming":
			return false;				
			
		default:
			return true;
		}
		
	}

}
