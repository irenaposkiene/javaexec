import java.io.IOException;
import java.util.Scanner;

public class Monetos {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
		  System.out.print("Type a number");
		  int n= reader.nextInt();
		  
		  int sk1;
		  int sk2;
		  int sk3;
		 
		 
			  sk1 = n/5;
			  sk2= (n-(sk1*5))/2;
			  sk3= (n-(sk1*5)-(sk2*2))/1;
		  

		  System.out.print("Atsakymas: po 5monetas"+  sk1+ "*po 2monetas"+sk2+"*po 1monetas"+sk3);
		
	}

}
