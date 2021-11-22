package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {
		//다음과 같이 출력되는 구구단을 출력하세요.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int dan=2; dan<= 9; dan++)
		{
			for(int i=1; i<=9; i++)
			{
				System.out.println(dan+"*"+i+"="+dan*i);
			}
			
		}
		
		sc.close();

	}

}
