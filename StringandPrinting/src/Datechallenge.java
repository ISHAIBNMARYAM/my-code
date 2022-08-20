import java.util.Scanner;

public class Datechallenge {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter a number: ");
				String str= sc.nextLine();
				System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}+"));
		}
	}

}
