package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
		/* if-else if-else 연습문제(조건 ==) ex08 약식으로 작성하기 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("코드를 입력하세요 : ");
		int code = sc.nextInt();
		
		switch(code) {
			case 1:
				System.out.println("101호입니다.");
				break;
			case 2:
				System.out.println("202호입니다.");
				break;
			case 3:
				System.out.println("303호입니다.");
				break;
			default:
				System.out.println("상담원에게 문의주세요.");
				break;
		}
		sc.close();
	}
}
