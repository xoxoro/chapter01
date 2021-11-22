package com.javaex.ex04;

public class Ex11 {
		//20까지의 숫자중 2의 배수와 3의 배수를 제외하여 출력하라.
	public static void main(String[] args) {
		
		
		for(int i=1; i<=20; i++) {
			
			if((i%2==0) || (i%3==0)){
				//System.out.println(i); //아무일도 안해야한다
				continue;
			}
			
			System.out.println(i);
		}
		
	}

}

/*for(int i=1; i<=20; i++) {
	
	if( !(i%2==0 || i%3==0) ) //2의배수거나 3의배수가 아닌것만 출력해
	{
		System.out.println(i);
	}
}*/