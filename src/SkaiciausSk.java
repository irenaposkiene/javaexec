import java.io.IOException;
import java.util.Scanner;

public class SkaiciausSk {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti skaicius");
		
		  int sk = reader.nextInt();
		  int y = 0;
		  
		  while (sk/10>0) {
			  
			  int s=sk%10;
			  y++;
			  
			  sk=sk/10;
			  
		  }
		 System.out.println(y+1);
	}

}
