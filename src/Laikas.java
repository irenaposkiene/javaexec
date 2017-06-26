import java.io.IOException;
import java.util.Scanner;

public class Laikas {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti laika");
		  int val= reader.nextInt(); 
		  System.out.print(":");
		  int min= reader.nextInt(); 
		  System.out.print(":");
		  int sek= reader.nextInt();
			
		  int s=sek+5;
		  if (s<60) {
	  
		  System.out.print("val:" + val + "min"+ min+ "sek"+s);
		  }
		  else {
			  int m = min+1;
			  int ss= s-60;
		  System.out.print("val:" + val + "min"+ m+ "sek"+ss);
		  }
		  
		  
	}

}
