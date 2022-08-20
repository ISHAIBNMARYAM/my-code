import java.util.Scanner;

public class Hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			String str= sc.nextLine();
			System.out.println(str.matches("[0-9 A-F]+"));
	}

}
}