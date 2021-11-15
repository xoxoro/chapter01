package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args){
		
		
		//println() print()차이점
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println("안녕하세요");
		
		//println() 사용범
		int i= 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한'; //기본자료형 8개중 하나
		String s = "한"; //기본자료형 아님
		
		String name = "심유정";
		
		
		System.out.println("안녕하세요"); //안녕하세요
		System.out.println(str); //굿모닝
		System.out.println(i); //2345
		System.out.println(d); //3.14
		
		System.out.println(str+str); //굿모닝+굿모닝-->굿모닝굿모닝 *문자열끼리 더할수있다
		System.out.println(str+i); //굿모닝+2345-->*문자열과 정수를 더할수있다
		System.out.println(str+d); //굿모닝+3.14-->*문자열과 실수를 더할수있다
		System.out.println(str+c); //굿모닝한
		System.out.println(str+" 이랑 "+i); //굿모닝+" "+"이랑"+" "+2345-->굿모닝 이랑 2345
		
		System.out.println(i+i); //2345+2345 23452345 *문자열이 아니기때문에 계산이 되어서 나온다
		System.out.println(i+d); //2348.14 *자동형변환이 되어서 정수가 실수값으로 나옴
		System.out.println(c+c); //코드값이 더해져서 나옴. 그래서 char을 조심해야함
		System.out.println(c+s); //한한
		
		System.out.println("제이름은 "+name+"입니다.");//제이름은 심유정입니다.
		System.out.println("안녕\"하\"세요"); //안녕"하"세요
		System.out.println("안녕\\하\\세요");//안녕\하\세요
		System.out.println("안녕\t하세요"); //t는 tap키를 의미.일정간격 벌려준다.
		System.out.println("안녕");
		System.out.println("하세요");
		System.out.println("안녕/n하세요"); //n은 줄바꿈을 의미. 줄을 바꿔준다
	
	
		
		
	}
	
	
	
}
