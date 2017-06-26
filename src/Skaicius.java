import java.io.IOException;
import java.util.Scanner;

public class Skaicius {

	
	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
		  System.out.print("Type a number");
		  int x= reader.nextInt();
		
		  int suma=0;
		  int sk=x;
		  
		
		  while (x > 0) {
		            suma = (int) (suma + Math.pow(x % 10, 3));
		            x = x / 10;
		        
		  }
		        System.out.println(suma);
		        
		        if (suma==sk) {
		        	  System.out.println("SK Amstrongo");
				        
		  }
		        else {
		        	 System.out.println("SK ne Amstrongo");
		        }
		  
		
	}
			  
	  
	    

}  
	
	
		/*  public static int suma (int sk) {
			
			  int suma = 0;
			  
			  while (sk >0) {
				 int last = sk%10;
				 
				  suma =suma+last;
				  int first =sk/10;
			  }
			 
			  return suma;*/
		 
		  
               
        
		  
          		  
        	
        
        	
	
	

