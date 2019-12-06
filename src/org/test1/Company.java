package org.test1;

public class Company {

	public static void main(String[] args) {
		String s="Java";
		String s1="Java";
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String n=new String("selenium");
		String n1=new String("selenium");
		System.out.println(System.identityHashCode(n));
		System.out.println(System.identityHashCode(n1));
		String t="Hema";
		String t1="vathi";
		String cc=t.concat(t1);
		System.out.println(System.identityHashCode(t));
		System.out.println(System.identityHashCode(t1));
		System.out.println(System.identityHashCode(cc));
		System.out.println(cc);
		StringBuffer b=new StringBuffer("Tharunika");
		StringBuffer b1=new StringBuffer("Manikanadan");
		StringBuffer b2=b.append(b1);
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(b1));
		System.out.println(System.identityHashCode(b2));
		System.out.println(b2);
		
	}

}
