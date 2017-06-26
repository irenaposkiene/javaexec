import java.util.Scanner;

public class Skaiciaicikle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sand=1;
		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti skaiciu kiek");
		
	
	        int sk = reader.nextInt();
	        
	        int s;
	        
	      for (int i=0; i<sk;i++) {
	        	s=reader.nextInt();
	        	
	        	
	        	sand =sand*s;
	        	
	          
	       
		  }
	      System.out.print("ats "+sand);
			
		
	}

}
