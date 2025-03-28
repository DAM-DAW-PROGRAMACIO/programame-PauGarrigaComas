package Easy;

import java.util.Scanner;

public class p682b {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int casos = scn.nextInt();
		
		for (int i=0;i<casos;i++)
		{
			int anecs = scn.nextInt();
			System.out.println(anecs+" "+anecs*2);
		}		
		scn.close();
	}
}