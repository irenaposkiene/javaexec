import java.io.IOException;
import java.util.Scanner;

public class SkaiciuAr {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti intervala");
		  int m= reader.nextInt();
		  int n= reader.nextInt();
		  
		  System.out.print("ivesti sk");
		  int sk= reader.nextInt();
			
		  for(int i =m; i<n;i++) {
			  if (sk>m||sk==m&&sk <n||sk==n) {
			  System.out.print("yra intervale");
				  
		  }
			  else System.out.print("nera intervale");
				
				  
		  }
		  
	}

}
