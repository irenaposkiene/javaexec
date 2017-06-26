import java.util.Scanner;

public class DaugybosLent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti sk:");
			
	      int sk = reader.nextInt();
	      
	      daugybosLentele (sk);	      
	}

	
	public static void daugybosLentele (int s) {
		
		int sk;
		
		for(int i=1 ;i<10;i++) {
			
			sk =i*s;
			System.out.println(s +"*"+ i+ "="+ sk);
				
		}
		  
		
	}
	
}
