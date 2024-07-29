package com.mycompany.ch03;

public class IncreaseDecreaseOperator2 {

	public static void main(String[] args) {

//		증감연산자 (++, --)
		
		int i = 7;
		int j = 8;
		
		i++;
		++j;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("-----------------");
		
		int m = i++;
		int n = ++j;
		
		System.out.println("m: " + m);
		System.out.println("i: " + i);
		System.out.println("n: " + n);
		System.out.println("j: " + j);
		System.out.println("-----------------");
		
		--i;
		int z = ++i + j++;
		System.out.println("z: " + z);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
	}

}
