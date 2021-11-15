package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
		//if-else if-else 연습문제(조건 ==)
		//과목번호를 입력받아 강의실 번호를 출력하라.
		/* 1이면 "R101호" 2이면 "R202호" 3이면 "R303호" 4이면 "R404호" 나머지는 "상담원에게 문의하세요" */ 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		System.out.print("과목번호: ");
		int sub = sc.nextInt();
		
		if(sub==1) {
				System.out.println("R101호");
		}
		
		else if(sub==2) {
				System.out.println("R202호");
		}
		
		else if(sub==3) {
				System.out.println("R303호");
		}
		
		else if(sub==4) {
				System.out.println("R404호");
		}
		
		else {
				System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
	}

}
