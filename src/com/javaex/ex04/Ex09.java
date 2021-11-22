package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
		//숫자를 입력받아 3의 배수인지 판별하라.
		//0이 입력되면 "프로그램 종료"됨
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean action = true;//액션이란 변수안에 트루를 넣음
		
		
		while(action) //그러면 while(true)대신 쓸수있음
		{
			
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num==0) 
			{
				System.out.println("종료");
				action=false;//break;대신에 쓸수있음
			}
			
			else if(num%3==0) 
			{
				System.out.println("3의 배수입니다.");	
			}
			
			else
			{
				System.out.println("3의 배수가 아닙니다");
			}
			
		}
		
		sc.close();
	}

}
