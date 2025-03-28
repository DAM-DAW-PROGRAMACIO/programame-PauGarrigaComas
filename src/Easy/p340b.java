package Easy;

import java.util.Scanner;

public class p340b {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int proves = scn.nextInt();
		
		for (int i=0;i<proves;i++)
		{
			int n = scn.nextInt();
			int m = scn.nextInt();
			
			int total = 0;
			
			total = (4+(3*(n-1))) + (((m-1)*3)+(((m-1)*2)*(n-1)));
			System.out.println(total);
		}
		scn.close();
	}
}
