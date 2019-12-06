package org.test1;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println(name);
		
		int id = sc.nextInt();
		System.out.println(id);
		
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		
		
		int total = m1+m2+m3+m4+m5;
		
		System.out.println(total);
		
		int avg = total/5;
		System.out.println(avg);
		

	}

}
