package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
		//조건문 연습문제 -4
		//점수를 입력받아 등급을 표시하라.
		/* 90점 이상 A / 89점 이하 B / 79점 이하 C / 69점 이하 D / 60점 미만 F*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.println("A등급");	
		}
		
		else if(grade>=80) {
			System.out.println("B등급");	
		}
		
		else if(grade>=70) {
			System.out.println("C등급");	
		}
		
		else if(grade>=60) {
			System.out.println("D등급");	
		}
		
		else if(grade<60) {
			System.out.println("F등급");	
		}
		
		sc.close();

	}

}
