package xCOJ;

import java.util.Scanner;

public class Kings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int xPersonsN = scan.nextInt();
		int xWinsK = scan.nextInt();
		int xRounds = xPersonsN*xWinsK;
		
		if (xPersonsN % 2 != 0) {
//			System.out.println("This is possible");
			if (xRounds/xWinsK == xPersonsN) {
				System.out.println(xPersonsN*xWinsK);
			} else {
				System.out.println("-1");	
			}
			
		} else {
			System.out.println("-1");
		}
			

	}

}
