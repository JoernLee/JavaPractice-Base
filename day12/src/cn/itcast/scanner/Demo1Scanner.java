package cn.itcast.scanner;

import java.util.Scanner;

public class Demo1Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //System.in�Ǳ�׼������
		/*//�ж�sc���յ��ǲ���int��
		if(sc.hasNextInt()){
			int x = sc.nextInt();
			System.out.println(x);
		}else{
			System.out.println("�������");
		}*/
		
		//����¼�������ַ���
		System.out.println("�����һ���ַ���");
		String line1 = sc.nextLine();
		System.out.println("����ڶ����ַ���");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + "line2 = " + line2);
		
		
	}

}
