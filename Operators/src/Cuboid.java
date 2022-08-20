import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in)) {
	int a,b,c;
	float volume;
System.out.println("enter value of a b c: ");


a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
    volume = a*b*c;
System.out.println("volume of cuboid is "+volume);
}
	}

}
