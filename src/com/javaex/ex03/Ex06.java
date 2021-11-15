package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
	//조건문 연습문제 -3
	//점수를 입력받아 입력된 수가 3의 배수인지 판별하라.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		int div = (score%3);
		
		
		if(div==0) {
		System.out.println(score+"은(는) 3의 배수 입니다.");
		
		}
		
		
		else {
			
			System.out.println(score+"은(는) 3의 배수가 이닙니다.");
		}
		
		
		sc.close();
		
	}

}
