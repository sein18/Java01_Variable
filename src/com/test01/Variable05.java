package com.test01;

public class Variable05 {

	public static void main(String[] args) {
		
		//�غ�
		//Ŭ������ ������ = new Ŭ������();
		Variable05 test = new Variable05();
		
		//����
		//������.�޼ҵ��();
		test.testOverFlow();
	}

	public void testOverFlow() {
		//byte bnum = 128;
		
		byte bnum = 127;
		bnum =(byte)(bnum + 1);
		
		System.out.println("bnum: " + bnum);
	}
	
}
