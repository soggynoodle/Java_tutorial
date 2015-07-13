
public class Driver {
	
	public static boolean status1;
	public static boolean status2;
	public static boolean status3;
	public static boolean status4;

	public static void main(String[] args) {

		Input pass = new Input();
		Checker check = new Checker();
		status1 = false;
		status2 = false;
		status3 = false;
		status4 = false;
		
		while ((status1&&status2&&status3&&status4) == false){
		String word = pass.GetPassword();
		System.out.println(word);
		
		status1 = check.hasLength(word);
		System.out.println("At least 6 characters long? " + status1);
		status2 = check.isOriginal(word);
		System.out.println("Original? " + status2);
		status3 = check.hasCap(word);
		System.out.println("Capital letter? " + status3);
		status4 = check.hasNum(word);
		System.out.println("Number? " + status4);
		
		}
		
		System.out.println("Thank you, your password has been accepted!");
					
	}

}
