package array;

import java.util.Scanner;

public class payment {

	public enum Day {
		Sun, Mon, Tue, Wed, Thu, Fri, Sat
	}

	public static void main(String[] args) {

//		Day[] DayNow = Day.values();
//
//		for (Day now : DayNow) {
//			switch (now) {
//			case Sun: {
//				System.out.println("Today is sunday");
//				break;
//			}
//			case Mon: {
//				System.out.println("Today is Monday");
//				break;
//			}
//			case Tue: {
//				System.out.println("Today is Tuesday");
//				break;
//			}
//			case Wed: {
//
//				System.out.println("Today is Wednesday");
//				break;
//			}
//			case Thu: {
//				System.out.println("Today is Thursday");
//				break;
//			}
//			case Fri: {
//				System.out.println("Today is Friday");
//				break;
//			}
//			case Sat: {
//				System.out.println("Today is saturday");
//				break;
//			}
//
//			}
//		}
//

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Day : ");
		String now = sc.next();

		switch (now) {
		case "Sun": {
			System.out.println("Today is sunday");
			break;
		}
		case "Mon": {
			System.out.println("Today is Monday");
			break;
		}
		case "Tue": {
			System.out.println("Today is Tuesday");
			break;
		}
		case "Wed": {

			System.out.println("Today is Wednesday");
			break;
		}
		case "Thu": {
			System.out.println("Today is Thursday");
			break;
		}
		case "Fri": {
			System.out.println("Today is Friday");
			break;
		}
		case "Sat": {
			System.out.println("Today is saturday");
			break;
		}
		default :
		{
			System.out.println("Day not avaible");
		}

		}

	}
}
