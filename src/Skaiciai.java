import java.io.IOException;
import java.util.Scanner;

public class Skaiciai {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti skaicius");
		
	
	        int sum1 = 0;
	        
	        int sum2 = 0;
	        
	        
	        int sk=-1;
	        
	        while (sk!=0) {
	        	sk=reader.nextInt();
	        	if (sk%2==0) {
	        		sum1 +=sk;
	        	}
	        	else {
	        		sum2 +=sk;
	        	}
	          
	       
		  }
	        System.out.print("LYG "+sum1+ "NELYG "+sum2);
			
	}

}
