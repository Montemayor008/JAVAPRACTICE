package xJavaPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class Integrals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger xExponent, xOne, xAddition;
		
		Scanner scan = new Scanner (System.in);
		String xVariable = scan.nextLine();
		BigInteger xExpo = scan.nextBigInteger();
		xOne = new BigInteger("1");
		xAddition = xExpo.add(xOne);
		
		System.out.println(xVariable + "^");
		System.out.println(xAddition);
		System.out.println("/" + xAddition);
		

	}

}
