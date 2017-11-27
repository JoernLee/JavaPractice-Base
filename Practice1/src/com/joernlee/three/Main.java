package com.joernlee.three;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//1.mathLearn();
		//2.ϵͳ�෽����gc�������գ�exit�˳�����������б�׼���������������currentTimeMillis������������ʱ1970.1.1��ʱ������ֵ��������ͨ������ķ�ʽȷ������ʱ�䡣
		//3.bigIntegerLearn();
		//4.bigDecimalLearn();
		//5.Date��ѧϰ
		//dataLearn();
		//6.DataFormate��ѧϰ
		//dateFormatLearn();
		//7.Calendar��ѧϰ
		//calendarLearn();
	}

	private static void calendarLearn() {
		/*
		 * �����࣬Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �� �����ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
		 * ˲����ú���ֵ����ʾ�����Ǿ���Ԫ�����������α�׼ʱ�� 1970 �� 1 �� 1 �յ� 00:00:00.000���������������ƫ������
		 * */
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);			//ͨ��ָ�����ֶλ�ȡ����ֵ
		System.out.println(year); //2017
		int month = c.get(Calendar.MONTH);
		System.out.println(month + 1); //ע���1��9
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day); //28
		
		/*
		 * public abstract void add(int field,int amount)���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ������
		 * ���磬Ҫ�ӵ�ǰ����ʱ���ȥ 5 �죬����ͨ���������·���������һ�㣺 add(Calendar.DAY_OF_MONTH, -5)��
		 * */
		//���Ƕ�ǰ���ֶ��޸�
		//set���������޸�ʱ�����
		Calendar c1 = Calendar.getInstance();
		//c.add(Calendar.MONTH, -3);					//(int field,int amount)amout������ǰ��������ֶ����ӻ����(����������)
		//c.set(Calendar.YEAR, 2000);
		c1.set(2008, 2, 8);
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH) + 1);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
	}

	private static void dateFormatLearn() throws ParseException {
		/*
		 * SimpleDateFormat ��һ���������Ի����йصķ�ʽ����ʽ���ͽ������ڵľ����ࡣ��������и�ʽ�������� -> �ı������������ı� -> ���ڣ��͹淶���� 
		 * SimpleDateFormat ʹ�ÿ���ѡ���κ��û����������-ʱ���ʽ��ģʽ�����ǣ���Ȼ����ͨ�� DateFormat �е� getTimeInstance��getDateInstance �� getDateTimeInstance ����������-ʱ���ʽ����
		 * ÿһ���������෽�����ܹ�����һ����Ĭ�ϸ�ʽģʽ��ʼ��������/ʱ���ʽ����
		 * ���Ը�����Ҫʹ�� applyPattern �������޸ĸ�ʽģʽ���й�ʹ����Щ�����ĸ�����Ϣ������� DateFormat�� API���������ָ����ʽ
		 * 
		 * 
		 * */
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance();		//����DateFormat���������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");//������ȴ�Сд�;���λ��û�����ƣ�����y��m��d���������ǲ��ܱ�ģ�����Կ���Դ��
		
		System.out.println(d);   
		System.out.println(df.format(d)); //�����DateFromat��ʼ�ĸ�ʽ
		String time = sdf.format(d);
		System.out.println(time);		//�̳���DateFormat
		
		//���ַ���ת��Ϊʱ��
		String str = "2012��3��22�� 08:30:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date d2 = sdf2.parse(str);					//�������ַ���ת�������ڶ���
		System.out.println(d2);
	}

	private static void dataLearn() {
		//����ܶ෽����ʱ�ˣ�
		Date d1 = new Date();				//������ǰʱ�����
		System.out.println(d1);
		
		Date d2 = new Date(1000);			//����ָ���ĺ���ֵ����ʱ�����
		System.out.println(d2);
		
		d2.setTime(10000000);
		System.out.println(d2);
		
		System.out.println(d2.getTime());
	}

	private static void bigDecimalLearn() {
		//System.out.println(2.0 - 1.1);
				/*BigDecimal b1 = new BigDecimal(2.0);		//��double��������������,���ǿ�������
				BigDecimal b2 = new BigDecimal(1.1);
				
				System.out.println(b1.subtract(b2));
				BigDecimal b1 = new BigDecimal("2.0");		//�Ƽ�ʹ��	
				BigDecimal b2 = new BigDecimal("1.1");
				System.out.println(b1.subtract(b2));*/
				
				BigDecimal b1 = BigDecimal.valueOf(2.0);	//�Ƽ�ʹ��
				BigDecimal b2 = BigDecimal.valueOf(1.1);
				System.out.println(b1.subtract(b2));
	}

	private static void bigIntegerLearn() {
		BigInteger b1 = new BigInteger("100");
		BigInteger b2 = new BigInteger("2");
		//System.out.println(b1.add(b2));				//+
		//System.out.println(b1.subtract(b2));		//-
		//System.out.println(b1.multiply(b2));  		//*
		//System.out.println(b1.divide(b2));  		//��
		BigInteger[] arr = b1.divideAndRemainder(b2);	//�̺�����
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		//50��0
	}

	private static void mathLearn() {
		// TODO �Զ����ɵķ������
		//System.out.println(Math.PI);
		//System.out.println(Math.abs(-10));				//ȡ����ֵ
		//System.out.println(Math.abs(10));					
		//System.out.println(Math.ceil(12.33));				//�컨��(����ȡ��,������һ��double��)
		//System.out.println(Math.ceil(12.77));
		//System.out.println(Math.floor(12.33));			//�ذ�(����ȡ��,������һ��double��)
		//System.out.println(Math.floor(12.77));
		//System.out.println(Math.max(10, 100));
		//System.out.println(Math.pow(2, 3));	 			//2.0 ^ 3.0�η�
		//System.out.println(Math.random());				//�����(0.0 - 1.0֮��,������1.0)
		//System.out.println(Math.round(12.33));
		//System.out.println(Math.round(12.53));			//��������
		//System.out.println(Math.sqrt(9));	 				//��ƽ��
	}

}
