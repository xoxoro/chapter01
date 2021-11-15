package com.javaex.ex01;

public class Ex09 {
	public static void main(String []args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 &&
		System.out.println(true&&true); //-->true
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		//&&연산자 응용
		System.out.println( (a>b) && (a<b) ); //false&&true -->false
		System.out.println( (a>b) && (a>b) ); //f&&f-->f
		
		
		//논리연산자||
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		//||연산자 응용
		System.out.println( (a>b)||(a<b) ); // f||t --> t
		
		
		
		//!(not)연산자 응용
		System.out.println(!true); //-->false
		System.out.println(!false); //-->true
		System.out.println(!(a<b)); //5<7-->t !true-->f
		
		
		
		
		
		
	}
}
