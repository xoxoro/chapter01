package com.javaex.ex05;

public class Ex06 {
	public static void main(String[] args) {
		
		int[] arrA = new int[] {10,20,30};
		int[] arrB = new int[] {10,20,30,};
		
		if(arrA==arrB) {
			System.out.println("");
			for(int i=0; i<arrA.length; i++) {
				if(arrA[i]!=arrB[i]) {
					System.out.println(i+"번째가 다릅니다.");
				}
				else{
					System.out.println(i+"번째가 같습니다.");
				}
			}
		}
		
		else  {//배열의 크기가 다른경우
			for(int i=0; i<arrA.length; i++) {
			System.out.println(i+"번째가 같습니다.");
			}
		}	
		
		
		
		
		
		
		
		
	}
}
