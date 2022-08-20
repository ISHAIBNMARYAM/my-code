import java.util.*;
 
public class weird {
    
    
    public static void main(String args[]) {
     // Weird Algorithm
     Scanner sc=new Scanner(System.in);
     long n=Integer.parseInt(sc.nextLine());
     while(n>1){
    	 System.out.print(n+" ");
         if(n%2==1){
        	  n=n*3+1;
          
         }
         else{
            
             n=n/2;
         }
     }
     System.out.print(n);
        
    }
}

