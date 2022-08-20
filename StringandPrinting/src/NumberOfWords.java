import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   abc de fgh ijkl   ";
		str=str.replaceAll("\\s+", " ").trim();
	      String words[]=str.split("\\s");
	      System.out.println(words.length);
	}

	}


