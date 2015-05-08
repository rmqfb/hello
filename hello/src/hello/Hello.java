package hello;

public class Hello {
	public static void main(String[] args) {
		System.out.println("±¸±¸´Ü~!");
		for (int i = 2; i < 10; i += 4) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j) + "\t"
						+ (i + 1) + "x" + j + "=" + ((i + 1) * j) + "\t"
						+ (i + 2) + "x" + j + "=" + ((i + 2) * j) + "\t"
						+ (i + 3) + "x" + j + "=" + ((i + 3) * j) + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------\n");

		/*
		  for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 6; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int j = 1; j < 10; j++) {
			for (int i = 6; i < 10; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		
		*/
	}
}