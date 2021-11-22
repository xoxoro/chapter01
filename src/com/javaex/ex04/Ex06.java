package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {
		//for 반복문 연습문제(중첩 반복문)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		for(int y=1; y<=6; y++)//가상의 첫째줄
		{
			for(int x=1; x<=6; x++)//가로로 별출력 
			{
				System.out.print("*");
			}
			System.out.println("^");
		}	
		
			
		
		
		
		
		sc.close();
	}

}
