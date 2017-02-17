package com.luxoft.jva007.exercise06;

public class Test {
    public static void main(String[] args) {
		int v1 = 3;
		// byte v = v1; // incorrect - we need explicit casting
		byte v2 = (byte)v1;
		System.out.println("v2 = " + v2); // 3
        
		v1 = 256;
		byte v3 = (byte)v1;
		// precision loss
		System.out.println("v3 = " + v3); //0
        
        // print the character number
		int v4 = 's';
		System.out.println("v4 = " + v4); //115
		
		// use of character number
		byte v5 = 115;
		if (v5 == 's') {
			System.out.println("Equals"); //"Equals"
		}
		
		// What exactly will be printed?
		System.out.println((double)4); 
		
		//What exactly will be printed?
		double d = 5;
		System.out.println("(d + 1) = " + (d + 1)); 
		System.out.println("d + 1 = " + d + 1); 
		
		boolean b = v4==0 ? false : true;
		System.out.println("b = " + b); // true
		
		short[] v6 = {'s', 'h', 'o', 'r', 't'};
		
		System.out.println(v6); //an array is an object 
		
		// we have to explicitly put f to literal
		float v7 = 3.67f;
		//float v7 = 3.67; // that is an error, because it is double by default
		
		float v9 = 3; // Why is there no compilation error?
		
		// type casting - just discard the decimal part
		int v8 = (int)v7;
		
		// what size array will be created?
		int array[][] = new int['2']['7'];
		
		System.out.println("array.length = " + array.length);
		System.out.println("array[0].length = " + array[0].length);
		
		int s1 = 0;
		System.out.println("Before executing the foo function, s1 = "+s1);
		foo(s1); // there could be no side effect
		System.out.println("After executing the foo function, s1 = "+s1);
		
		int k1 = 10;
		int k2 = 0;
//      k1 = k1++;
//		k2 = k1++;
//		k1 = k1++ + k1++;
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
		
		int[] ari = {0, 111};
		k1 = ioo(ari) + ioo(ari);
	}
    
	public static void foo(int ii) {
		ii = 1; 
	}
	
	public static int ioo(int[] ari) {
		int i = ari[0];
		i = i++;
		ari[0] = i;
		i = ari[1];
		i = i++;
		ari[1] = i;
		System.out.println("ari[0] = " + ari[0]);
		System.out.println("ari[1] = " + ari[1]);
		return 0;
	}
}
