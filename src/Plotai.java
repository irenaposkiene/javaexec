import java.util.Scanner;

public class Plotai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner reader = new Scanner(System.in);
		  System.out.println("Turinys:");
		  System.out.println("1. kvadrato plotas");
		  System.out.println("2. staciakampio plotas");
		  System.out.println("3. Stac. trikampio plotas");
		  
		  System.out.println("Pasirinkti:");
		   
		    int p = reader.nextInt();  
		     	 		 
		  pasirinkti(p);
		  
		  
	}
	
	public static void pasirinkti(int sk) {
		
		switch (sk) {
		case 1:{
		 Scanner reader1 =  new Scanner(System.in);
		    System.out.println("Iveskite a:");
			   
		    int a = reader1.nextInt();  
		          
		    kplotas (a);
		    break;
		}
		case 2:{
			 Scanner reader1 =  new Scanner(System.in);
			 System.out.println("Iveskite a:");
			 double a = reader1.nextDouble();  
		      
			 System.out.println("Iveskite b:");
			 double b = reader1.nextDouble();  
			    
		    stplotas (a,b);
		    break;
		}	
		case 3:{
			 Scanner reader1 =  new Scanner(System.in);
			 System.out.println("Iveskite a:");
			 double a = reader1.nextDouble();  
		      
			 System.out.println("Iveskite b:");
			 double b = reader1.nextDouble();  
			    
		    stplotas (a,b);
		    break;
		}	
		default:
			   System.out.println("Unknown result");
			
			            break;
		
		
		}
		}
		public static void kplotas (int a) {
			
			int plotas = a*a;
		
		System.out.println("Plotas:" +plotas);
	}
		
		public static void stplotas (double a, double b) {
			
			double plotas = a*b;
		
		System.out.println("Plotas:" +plotas);
	}
	
}
