package Easy;

import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int num2;
		long suma;
		
		for(int i=0;i<num;i++) {
			suma=0;
			num2 =  scanner.nextInt();
			for(int j=0;j<num2;j++) 
				suma=suma+scanner.nextInt();
			System.out.println(suma);
		}

		scanner.close();
	}
}
