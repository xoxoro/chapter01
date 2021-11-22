package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		//무한대로 돌리는방법
		/*int i=0;
		 while(true)
		 */
		
		int i = 0;//비교할 정수 초기값
		
		while(true) {
			
			i=i+1; //i++
			
			if(i%6==0 && i%14==0) {
				System.out.println(i);
				break;
			}
			
		}

	}

}
