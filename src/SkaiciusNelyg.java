import java.io.IOException;
import java.util.Scanner;

public class SkaiciusNelyg {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub


		 Scanner reader = new Scanner(System.in);
		  System.out.print("ivesti intervala");
		  int m= reader.nextInt();
		  int n= reader.nextInt();
		  int l= reader.nextInt();
		  
		  int [] array= {m,n,l};
		  
		  int max =0;
		  
		  for (int i =0;i <array.length; i++) {
			  
			  if (max<array[i]) {
				  max=array[i];
			  }
		  }System.out.println(max);
	}

}
