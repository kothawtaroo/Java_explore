import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This is Sample Java calculator");
		
		System.out.println("Enter your First number.");
		int x = scanner.nextInt();
		
		System.out.println("Enter your Second Number.");
		int y = scanner.nextInt();
		
		int z = x+y;
		
		System.out.println("Your Number is "+ z + "." );
	}

}
