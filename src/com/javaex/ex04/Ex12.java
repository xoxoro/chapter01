package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
		//do~while문 사용자의 숫자를 입력받아 더하는 프로그램을 작성하라. 0이면 "종료"
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		/*
		do {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: "+sum);
		
		}while(num != 0); //0이 아니면 계속 계산
			
		*/
		
		while(true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: "+sum);
			
			if(num==0) { //num0이면 끝 --> while문을 나가라 --> break;
				break;
			}
		
		}
		
		System.out.println("종료");
		
		sc.close();
	}	
		
	
}
