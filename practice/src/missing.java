import java.util.Arrays;
import java.util.Scanner;
public class missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      long n =Integer.parseInt(sc.nextLine());
      long number = Arrays.stream(sc.nextLine().split(" "))
             .mapToLong(Long::parseLong)
             .sum();
      long result = (n*(n+1)/2) - number;
      System.out.print(result);
	}

}
