import java.io.IOException;
import java.util.Scanner;

public class Formule {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		  System.out.print("iveskite sk");
		  double x= reader.nextDouble();
		  
		  
		 double y= ((Math.pow(x, 2)*2)-(3*x))/(4.9-x);
		  System.out.print("ats"+ Math.round(y));
			 
	}

}
