package org.test1;

public class Employee {

	public static void main(String[] args) {
		String name="Hemavathi";
		String h1="hemavathi";
		char c =name.charAt(3);
		System.out.println(c);
		String up=name.toUpperCase();
		System.out.println(up);
		String lo=name.toLowerCase();
		System.out.println(lo);
		boolean sw=name.startsWith("H");
		System.out.println(sw);
		boolean ew=name.endsWith("i");
		System.out.println(ew);
		boolean co=name.contains("s");
		System.out.println(co);
		boolean eq=name.equals(h1);
		System.out.println(eq);
		boolean ic=name.equalsIgnoreCase(h1);
		System.out.println(ic);
		int io=name.indexOf("v");
		System.out.println(io);
		int li=name.lastIndexOf("i");
		System.out.println(li);
		int le=name.length();
		System.out.println(le);
		String cc=name.concat(h1);
		System.out.println(cc);
		String re=name.replace("a", "m");
		System.out.println(re);
		String ra=name.replaceAll(name, "Tharu");
		System.out.println(ra);
		String d="";
		boolean em=d.isEmpty();
		System.out.println(em);
		String b=" Welcome ";
		String trim=b.trim();
		System.out.println(trim);
		String ss=name.substring(5);
		System.out.println(ss);
		CharSequence cs=name.subSequence(3, 8);
		System.out.println(cs);
		String t="Welcome to java class";
		String[] sp=t.split("e");
		System.out.println(sp[2]);
		
		
	}

}
