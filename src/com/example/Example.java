package com.example;

import java.util.Scanner;

public class Example {
	
	public void example1() {
		Scanner sc =new Scanner(System.in);
		System.out.print("ù���� ���� : ");
		int num1 = sc.nextInt();

		System.out.print("ù���� ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ���: " + (num1 + num2));
		System.out.println("���� ���: " + (num1 - num2));
		System.out.println("���ϱ� ���: " + (num1 * num2));
		System.out.println("�������� ��: " + (num1 / num2));
		System.out.println("�������� ������: " + (num1 % num2));
		sc.close();
		
	}
	
	public void example2() {
		Scanner sc =new Scanner(System.in);
		System.out.print("���� : ");
		double width = sc.nextDouble();

		System.out.print("���� : ");
		double height = sc.nextDouble();
		
		System.out.println("���� : " + (width * height));
		System.out.println("�ѷ� : " + (width + height)*2);
		
		sc.close();
	}
	
	public void example3() {
		Scanner sc =new Scanner(System.in);

		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str =sc.next();		

		System.out.println("ù���� ���� : " + str.charAt(0));
		System.out.println("�ι��� ���� : " + str.charAt(1));
		System.out.println("������ ���� : " + str.charAt(2));
		System.out.println("�Էµ� ���� ���� : " + str.length());

		sc.close();
	}
}

