package com.test01;
import java.util.Scanner;

public class Variable03 {
	//변수 선언& 초기화
	//키보드로 입력받아 변수에 저장된 값 변경
	public static void main(String[] args) {
		//변수 선언
		String name = "박세인";
		char gender = 'M';
		int age = 19; 
		
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age); 
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름입력: ");
		name = sc.nextLine();
		
		System.out.print("성별입력: ");
		gender = sc.next().charAt(0); 
		
		System.out.print("나이입력: ");
		age = sc.nextInt();
		
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		
		sc.close(); 
		
	}
	 
}
