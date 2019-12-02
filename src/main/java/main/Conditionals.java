package main;

public class Conditionals {

	static int a = 3001;
	static int b = 7;
	static boolean isTrue = false;

	public static void main(String[] args) {

		System.out.println("Return Value is: " + returnValue(a, b, isTrue));
		System.out.print("Flowcart Value is: ");
		flowchart(a);
	}

	public static int returnValue(int a, int b, boolean isTrue) {
		if ((a % 2 == 0) || (b % 2 == 0)) {
			return 0;
		} else {
			if (isTrue == true) {
				return a + b;
			} else {
				return a * b;
			}
		}
	}

	public static void flowchart(int a) {
		if (a > 2000) {
			System.out.print("A");
			if (a > 6000) {
				System.out.print("C");
			} else {
				System.out.print("B");
				if (a > 4000) {
					System.out.print("D");
				} else {
					System.out.print("E");
				}
			}
		}

		else {
			System.out.print("1");
			if (a > 100) {
				System.out.print("3");
				if (a > 600) {
					System.out.print("5");
				} else {
					System.out.print("4");
					if (a > 500) {
						System.out.print("6");
					} else {
						System.out.print("7");
					}
				}
			} else {
				System.out.print("2");
			}
		}
	}
}