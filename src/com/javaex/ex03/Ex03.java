package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자:");
		
		int point = sc.nextInt();
		
		if(point>0) {//양수냐
			
			System.out.println("양수");
			
		}
		
		else if(point<0){ //음수냐 0이냐 
			
			System.out.println("음수");
			
		}
		
		else {//0만남네
			
			System.out.println("0");
		}
		
		
		
		
		
	}
	
}
