package com.test01;

public class Variable01 {
	//Ÿ�� ������;
	//���� = ��;
	
	//Ÿ�� ������ = ��;
	
	public static void main(String[] args) {
		
		//�غ�
		//Ŭ������ ������ = new Ŭ������();
		Variable01 test = new Variable01();
		
		//����
		//������.�޼ҵ��();
		test.declareVariable();
		test.initVariable();
		
	}
	
	public void declareVariable() {
		//������
		//������
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		//�Ǽ���
		float fnum;
		double dnum;
		
		//����
		char ch;
		
		//��
		boolean isTrue;
		
		//���ڿ�(������)
		String str;
		
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f;
		dnum = 8.0;
		
		ch ='A';
		str = "A";
		
		isTrue = false;
		
		//������ ����� �� ����ϱ�
		System.out.println("bnum�� ��: " + bnum);
		System.out.println("snum�� ��: " + snum);
		System.out.println("inum�� ��: " + inum);
		System.out.println("lnum�� ��: " + lnum);
		
		System.out.println("fnum�� ��: " + fnum);
		System.out.println("dnum�� ��: " + dnum);
		
		System.out.println("ch�� ��: " + ch);
		System.out.println("str�� ��: " + str);
		
		System.out.println("isTrue�� ��: " + isTrue);
		
	}
	
	public void initVariable() {
		//���� ����� ���ÿ� �ʱ�ȭ
		int inum = 4;
		double dnum = 8.0;
		char ch = 'A';
		String str = "�ȳ��ϼ���";
		
		System.out.println(inum);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(str);
		
		
	}

}










