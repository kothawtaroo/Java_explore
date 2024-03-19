import java.util.Scanner; // import class
public class newcalc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// Scanner object create
		
		System.out.println("This is Sample Java Calculator ");
		
		System.out.println("Please Enter First Number.");
		int x = scanner.nextInt();
		
		System.out.println("Please Enter Second Number.");
		int y = scanner.nextInt();
		
		int z = x+y;
		System.out.println("Your Answer is "+ z +".");

	}

}
