package CodingChallanges;

public class challange5 {

	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				num += i;

			} else {
				num -= i;
			}

		}

		System.out.println(num);
	}

}
