import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "a!B@c#1$2%3"	;
      System.out.println(str.replaceAll("[^a-z A-Z 0-9]",""));
	}

	}


