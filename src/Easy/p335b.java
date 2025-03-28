package Easy;

import java.util.Scanner;

public class p335b {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int proves = scn.nextInt();
		for (int i=0;i<proves;i++)
		{
			long caniques = 0;
			long altura = scn.nextLong();
			long repes = altura;
			for (int j=0;j<altura;j++)
			{
				for (long k=repes; k>0; k--)
				{
					caniques = caniques + k;
				}
				repes = repes -1;
			}
			System.out.println(caniques);
		}	
		scn.close();
		}
}

