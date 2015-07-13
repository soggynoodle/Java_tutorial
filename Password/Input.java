import java.util.Scanner;

public class Input {
	
	private String testPass;
	
	Scanner ask = new Scanner(System.in);
	
	public String GetPassword(){
		System.out.println("Please enter a Password: ");
		this.testPass = ask.next();
		return testPass;
	}
	
	
	

}
