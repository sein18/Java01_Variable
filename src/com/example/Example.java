package com.example;

import java.util.Scanner;

public class Example {
	
	public void example1() {
		Scanner sc =new Scanner(System.in);
		System.out.print("첫번쟤 정수 : ");
		int num1 = sc.nextInt();

		System.out.print("첫번쟤 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과: " + (num1 + num2));
		System.out.println("빼기 결과: " + (num1 - num2));
		System.out.println("곱하기 결과: " + (num1 * num2));
		System.out.println("나누기한 몫: " + (num1 / num2));
		System.out.println("나누기한 나머지: " + (num1 % num2));
		sc.close();
		
	}
	
	public void example2() {
		Scanner sc =new Scanner(System.in);
		System.out.print("가로 : ");
		double width = sc.nextDouble();

		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면접 : " + (width * height));
		System.out.println("둘레 : " + (width + height)*2);
		
		sc.close();
	}
	
	public void example3() {
		Scanner sc =new Scanner(System.in);

		System.out.print("문자열을 입력하시오 : ");
		String str =sc.next();		

		System.out.println("첫번쟤 문자 : " + str.charAt(0));
		System.out.println("두번재 문자 : " + str.charAt(1));
		System.out.println("세번재 문자 : " + str.charAt(2));
		System.out.println("입력된 글자 갯수 : " + str.length());

		sc.close();
	}
}

