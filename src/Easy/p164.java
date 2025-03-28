package Easy;

import java.util.Scanner;

public class p164 {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		
		String xy = scn.nextLine();
		String[] coordenades = xy.split(" ");
		int x1 = Integer.parseInt(coordenades[0]);
		int y1 = Integer.parseInt(coordenades[1]);
		int x2 = Integer.parseInt(coordenades[2]);
		int y2 = Integer.parseInt(coordenades[3]);
		
		while ((x1<=x2)&&(y1<=y2))
		{
			System.out.println((x2-x1)*(y2-y1));
			xy = scn.nextLine();
			
			coordenades = xy.split(" ");
			x1 = Integer.parseInt(coordenades[0]);
			y1 = Integer.parseInt(coordenades[1]);
			x2 = Integer.parseInt(coordenades[2]);
			y2 = Integer.parseInt(coordenades[3]);		
			
		}
	scn.close();
	}
}