package pcalss;

import java.util.Scanner;

public class CMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		a = input.nextInt();
		b = input.nextInt();
		calc c = new calc();
		System.out.println(c.add(a, b));

	}

}
