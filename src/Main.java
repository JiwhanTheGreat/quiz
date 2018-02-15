import java.util.Scanner;

public class Main {
	public static Scanner donkey = new Scanner(System.in);

	public static void main (String[] args) {
		System.out.println("Who made apple (type the number ONLY)");
		System.out.println("1- Jiwhan");
		System.out.println("2- Connor");
		System.out.println("3- farmers");
		System.out.println("4- Evan");
		boolean correctInput = false;

		while(!correctInput) {
			String sheepy = donkey.nextLine();
			switch(sheepy) {
			case "1":
				System.out.println("Good guess but wrong");
				break;
			case "2":
				System.out.println("U suck");
				break;
			case "3":
				System.out.println("Nice job");
				correctInput = true;
				break;
			case "4":
				System.out.print("You should go back to elementary school");
				break;
			default:
				System.out.println("invalid comment");
				break;
			}
		}
		correctInput = false;
		System.out.println("Who is our progamming lead (type the number ONLY)");
		System.out.println("1- Caleb Smith");
		System.out.println("2- Caleb Mikhailov");
		System.out.println("3- Jiwhan Kim");
		System.out.println("4- Connor Colbert");

		while(!correctInput) {
			correctInput = false;
			String sheepy = donkey.nextLine();
			switch(sheepy) {
			case "1":
				System.out.println("Nice Job");
				correctInput = true;
				break;
			case "2":
				System.out.println("U suck");
				break;
			case "3":
				System.out.println("U are so bad");
				break;
			case "4":
				System.out.print("You should go back to kindergarden");
				break;
			default:
				System.out.println("invalid comment");
				break;
			}
		}
		correctInput = false;
		System.out.println("Who is our future progamming lead (type the number ONLY)");
		System.out.println("1- Caleb Smith");
		System.out.println("2- Skyler");
		System.out.println("3- Jiwhan Kim");
		System.out.println("4- Jimmy Colbert");

		while(!correctInput) {
			correctInput = false;
			String sheepy = donkey.nextLine();
			switch(sheepy) {
			case "1":
				System.out.println("Nah he is too old");
				break;
			case "2":
				System.out.println("Nice job");
				correctInput = true;
				break;
			case "3":
				System.out.println("Very good guess and probably right but unfortunately wrong");
				break;
			case "4":
				System.out.print("You should go back to kindergarten");
				break;
			default:
				System.out.println("invalid comment");
				break;

			}
		}
		correctInput = false;
		System.out.println("What city has DisneyLand (type the number ONLY)");
		System.out.println("1- HongKong");
		System.out.println("2- Tokyo");
		System.out.println("3- Moscow");

		while(!correctInput) {
			correctInput = false;
			String sheepy = donkey.nextLine();
			switch(sheepy) {
			case "1":
				System.out.println("Correct");
				correctInput = true;
				break;
			case "2":
				System.out.println("Nice try");
				break;
			case "3":
				System.out.println("Niceee, but wrong");
				break;
			default:
				System.out.println("invalid comment");
				break;

			}
		}		
	}
}
