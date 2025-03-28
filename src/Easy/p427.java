package Easy;

import java.util.Scanner;

public class p427 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int casos = Integer.parseInt(scan.nextLine());
		for (int i=0; i<casos; i++)
		{
			String paraula1 = scan.nextLine();
			String paraula2 = scan.nextLine();
			
			if ((paraula1.contains("Luke")) && (paraula2.contains("padre"))) 
			{
				System.out.println("TOP SECRET");
			}
			else
			{
				System.out.println(paraula1 + ", yo soy tu "+ paraula2);
			}
		}
		scan.close();
	}
}