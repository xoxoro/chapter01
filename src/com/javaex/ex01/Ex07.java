package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		//대입연산자:오른쪽이 왼쪽으로 대입
		int a = 7;
		int b = 2;
		
		
		//산술연산자
		//sysout ctrl+space 누르면 자동완성됨
		
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		System.out.println(a / b); //3.5... 몫이 3 나머지 1 -->몫을 표시
		System.out.println(a % b); //3.5... 몫3 나머지 1 ---> 나머지 표시
		
		//산술연산자 / % 자세히
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0); //실수형으로 답이 나와야함 3.5
		System.out.println(7.0%2.0); //나머지가 나와야함 1.0
		
		
		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar); //+(-3)
		System.out.println(-var); //-(-3)
		
		
		//증감연산자
		System.out.println("증감연산자");
		
		
		
		
		
		
		
		
	}
	
	
}
