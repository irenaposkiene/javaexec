import java.io.IOException;
import java.util.Scanner;

public class Trizenkliai {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		
		Scanner reader = new Scanner(System.in);
		System.out.print("ivesti intervalo pradzia:");
		
		int m=reader.nextInt();
		
		System.out.print("ivesti intervalo pabaiga:");
		
		int n=reader.nextInt();
		
		for(int i=m;i<n;i++) {
			
			if (i%5==0) {
				System.out.println(i);
			}
		}
		
	}

}
