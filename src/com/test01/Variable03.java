package com.test01;
import java.util.Scanner;

public class Variable03 {
	//���� ����& �ʱ�ȭ
	//Ű����� �Է¹޾� ������ ����� �� ����
	public static void main(String[] args) {
		//���� ����
		String name = "�ڼ���";
		char gender = 'M';
		int age = 19; 
		
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age); 
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��Է�: ");
		name = sc.nextLine();
		
		System.out.print("�����Է�: ");
		gender = sc.next().charAt(0); 
		
		System.out.print("�����Է�: ");
		age = sc.nextInt();
		
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		
		sc.close(); 
		
	}
	 
}
