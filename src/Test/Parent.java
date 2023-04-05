package Test;

import Test1.b;



	public class Parent extends b {
		public static  void main(String[] args)
		{

		Parent b =new Parent();
		b.m1();
		m3();
		
		}
	public static void m2() {
		
		System.out.println(" called from  class b- m2 method ");
	}
	
public static void m3() {
		
		System.out.println(" -m3 method ");
		m4();
	}
private static void m4() {
	
	System.out.println(" -private  m4 method called from m3 method");
m5();
}
public static void m5() {
	
	System.out.println(" -private  m5 method  called from m4 method");
	
}
	}
	
	


