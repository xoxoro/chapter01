package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		
		
		//자동형변환
		System.out.println(2+3.4); //큰따옴표 넣으면 숫자가 아니라 글자로 취급한거
		
		double var01 = 2+3.4; //결과값을 실수값으로 맞춰줘야함 2.0(자동형변환)+3.4. float써도되는데 2+3.4f로 써야함
		System.out.println(var01); 
		
		//자동형변환(long + float)
		long var02 = 12345L; //int보다 작을때는 안붙여도됨
		float var03 = 1.1F; //롱이랑 다르게 f꼭붙여야함
		
		System.out.println(var02+var03); //계산하는순간에 long이 float형으로 바뀜
		
		float result = var02+var03; //형변환규칙에 의거. 정수+실수하면 소숫점을 버릴수없기때문에 무조건 실수쪽으로 감.
		
		System.out.println(result);
		
		////////////////////////////////
		
		//강제형변환 ㄷㅌ) double을 int로 담을 경우 소수점 버리는건 감수하고 씀
		int i= (int)111112.3232322;
		System.out.println(i);
		
		float f01 = 12.5f;
		
		int i01 = (int)f01;
		System.out.println(i01);
		System.out.println(f01);
		
		
		//강제 형변환 --> 확대 형변환
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v01);
		System.out.println(v01);
		
		//강제 형변환 --> 축소 형변환(정상)
		int v03 = 10; //4byte=>32bit
		byte v04 = (byte)v03; 
		System.out.println(v03);
		System.out.println(v04);
		
		//강제 형변환 --> 축소 형변환(비정상)
		int v05 = 34324324;
		byte v06 = (byte)v05;
		System.out.println(v05); //-->103029770
		System.out.println(v06); //->10
		
		//실수-->정수 : 소수부분이 없어짐 =5
		double v07 = 5.572314353;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 --> 실수 :
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
