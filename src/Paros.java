import java.io.IOException;
import java.util.Scanner;

public class Paros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti paru sk");
		  int p= reader.nextInt();
	
		 int val;
		 int min;
		 int sek;
		 
		 val= p*24;
		 min=val*60;
		 sek =min*60;
		
		 System.out.print("jei paru yra"+p+" min yra"+min+" sek yra"+sek);
	}

}
