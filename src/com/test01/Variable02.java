package com.test01;

import java.util.Scanner;

public class Variable02 {
	// Scanner Ŭ����
	
	public static void main(String[] args) {
		//�غ�
		Variable02 test = new Variable02();
		
		//����
		//������.�޼ҵ��();
		test.inputTest(); 
	}
	
	public void inputTest() {
		//�غ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name: ");
		String name = sc.nextLine();

		System.out.print("age: ");
		int age = sc.nextInt();
		
		System.out.print("height: ");
		double height = sc.nextDouble();
		
		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("height is " + height);
		
		sc.close();
	}
}
