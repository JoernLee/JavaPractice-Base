package com.joernlee.one;

import java.util.Scanner;

public class Main {
	/**
	С��׼��ȥħ�������ɹ�ħ������,����ħ��������Ҫʹ��ħ����,����С������һöħ���Ҷ�û��,
	����С������̨ħ����������ͨ��Ͷ��x(x����Ϊ0)��ħ���Ҳ��������ħ���ҡ�
	ħ������1:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+1��ħ����
	ħ������2:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+2��ħ����
	�ײɹ�ħ�������ܹ���Ҫn��ħ����,����С��ֻ��ͨ����̨ħ����������ǡ��n��ħ����,С����Ҫ��������һ��Ͷ�뷽��ʹ�����ǡ��ӵ��n��ħ���ҡ� 
	 * */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��ȡ�����Ҫ��Ӳ����
		String in = StringUtils.getPrintln();
		System.out.println(in);
		//ͨ�������ķ������ʹ��ħ��������˳��
		StringBuffer record = new StringBuffer("");
		String out = calMachine(Integer.parseInt(in), record);
		//������
		System.out.println(out);
	}
	
	private static String calMachine(int number,StringBuffer record){
		while(number != 0){
			if(number % 2 == 0){
				number = (number-2)/2;
				record = record.append("2");
			}else if(number % 2 == 1){
				number = (number - 1)/2;
				record = record.append("1");
			}
		}
		
		return record.reverse().toString();
	}
	
}
