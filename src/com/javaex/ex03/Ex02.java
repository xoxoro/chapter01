package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt();
		
		if(num>=60) {
			
			System.out.println("합격입니다.");
			//입력한 값이 60점 "이상"이니? 이질문이 true 일때만 대괄호 안에 들어가는 값이 실행됨
		}
		
		else {
			
			System.out.println("불합격입니다.");
		}
		
		System.out.println("프로그램 종료");//공통인 부분
		sc.close();
	}

}
