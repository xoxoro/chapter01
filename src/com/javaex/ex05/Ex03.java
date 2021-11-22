package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		/*int[] intArray = new int[4];//얘 숫자는 건들수없음
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[3] = 55;
		intArray[2] = 13;
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}*/
		
		System.out.println("===================");
		
		/*char[] charArray = new char[3];
		
		charArray[0] = 'A';
		charArray[1] = '한';
		charArray[2] = 'z';
		
		for(int i=0; i<3; i++) {
			System.out.println(charArray[i]);
		}*/
		
		System.out.println("===================");

		int[] intArray = new int[] {3,7,13};//얘 숫자는 건들수없음
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 13;
		//방을 잡아놓고 값을 안주면 0으로 세팅된다.예를 들어 new int[4]적어놓고 intArray[4]=x안적으면 x는 0으로 세팅됨.
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
