import java.io.IOException;
import java.util.Scanner;

public class SkaiciuSuma {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti skaicius");
		
		  int sk = reader.nextInt();
		  
		  int suma1 = 0;
		  int suma2 = 0;
		  
		  while (sk!=0) {
			  
			  int s= sk%10;
			  sk=sk/10;
			  
			  if (s%2==0) {
				  suma1 +=s;
			  }
			  else {
				  suma2 +=s;
			  }
			  
			  
		  } System.out.print("**"+suma1 +"****"+suma2);
			
	}

}
