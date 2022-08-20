import java.util.Scanner;

public class repitition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       long max=1;
       long curr=1;
		Scanner sc = new Scanner(System.in);
		String dna = sc.nextLine();
		for(int i=0;i<dna.length() - 1;++i) {
			if(dna.charAt(i) == dna.charAt(i + 1)) {
				curr++;
			}
			else {
				if(max<curr) {
					max=curr;
				}
				curr = 1;
			}
		}
		if(max<curr) max=curr;
		System.out.print(max);
	}

}
