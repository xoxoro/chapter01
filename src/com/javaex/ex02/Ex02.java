package com.javaex.ex02;

import java.util.Scanner; //컨트롤+쉬프트+알파벳o

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //여기까진 외워야함 *system.in 을 키보드 별명처럼 생각하기. sc는 키보드이름 작명한거
	
		System.out.println("숫자를 입력하세요"); //그냥 출력하려고 적은 말이라서 없어도됨
		int num = sc.nextInt(); //숫자를 넣어야 넘어감
		System.out.println("입력하신 숫자는 "+num+" 입니다.");
		
		
		
		

		
		
		
		
		sc.close(); //키보드와의 연결을 끊어주는것
		
		
	}
	
	
}
