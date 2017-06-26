import java.util.Scanner;

public class Konversija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti pinigu suma:");
			
	      double sk = reader.nextDouble();
	      
	     konversja(sk);
	        
		         
	}

	 public static void konversja (double a) {
		 
		 double dol = a*0.89;
		 System.out.print(dol); 
	 }
}
