package com.anutosh.interview;

public class OOPs {
	
	static{
		SampleClass staticSample = new SampleClass();
		staticSample.init();
		System.out.println(staticSample.test);
		System.out.println();
	}
	
	public static class SampleClass{
		public int test = 0;
		
		public void init(){
			this.test = Integer.MAX_VALUE;
		}
	}

	public static void main(String[] args) {
		SampleClass ob = new SampleClass();
		testMethod(ob);
		System.out.println(ob.test);
		System.out.println();
		testStringImmutable();

	}
	
	public static void testMethod(SampleClass ob){
		ob.test = 2;
	}
	
	private static void testStringImmutable(){
		String s1 = "Anutosh";
		String s2 = s1;
		s1 = s1 + " Datta";
		System.out.println(s1 == s2);
		String s3 = new String("Anutosh");
		System.out.println(s1 == s3);
	}

}
