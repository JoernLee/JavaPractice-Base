package com.joernlee.two;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//1.����capacity��length����
		//2.differenceCapLen();
		//3.StringBuffer/Builder�ೣ�÷���������ӣ�ɾ�����滻����ת����ȡ�Ӵ�
		//4.Arrays���Ƕ�������в��ݣ����������ַ������أ����ҵȵ�
		
		//5.intergerProblem();
		/* 6.
		 * �ӿ�Ҳ�̳�Object���Ǵ�ģ���Ϊ�ӿ����淽�����ǳ���ģ���object���淽�������ǳ���ģ�
		 * ����ӿ��Ǽ̳�Object�ģ���ô��ζ�Žӿ�������Զ���ǳ��󷽷��ˡ�
		 * ����Ϊʲô���õ�toString��������Ϊ�ӿ�����Object��������з�����ӳ�䡣
		 * 
		 * 
		 * */
		Inter i = new Test();			//��������ָ���������
		i.print();
		//i.run(); 						//����޷����У���Ϊ����ӿ�����û��������󷽷�
		System.out.println(i.toString());
	}

	private static void intergerProblem() {
		//Integer��һ����������
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);			//false
		System.out.println(i1.equals(i2));		//true
		System.out.println("-----------");
	
		Integer i3 = new Integer(197);
		Integer i4 = new Integer(197);
		System.out.println(i3 == i4);			//false
		System.out.println(i3.equals(i4));		//true
		System.out.println("-----------");
	
		Integer i5 = -128;
		Integer i6 = -128;
		System.out.println(i5 == i6);			//true
		System.out.println(i5.equals(i6));		//true
		System.out.println("-----------");
	
		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7 == i8);			//false
		System.out.println(i7.equals(i8));		//true
		
		/*
		 * ��Integerֱ�Ӹ�ֵ�ķ�Χ����-128��127֮��,Ҳ����һ��byte��ȡֵ��Χ,���ᴴ���������
		 * ��һ��Integer = -128,���ڵײ���һ������洢-128��127֮���Integer����ֵ,ֱ�Ӵ������л�ȡInteger����
		 * �ڶ���Integer = -128,�������´�������,�����������л�ȡ
		 * ���һ����ͬ���ǣ���һ����new�ˣ��϶��ǲ�ͬ���󣬵��ǵ��������ǿ��ײ��Ż��ˣ�С��byte���ӵײ���������ֱ��ȡ�ˡ�
		 */
		
		Integer[] arr = {new Integer(-128),127,-126};	//�����п��Դ洢������������
	}

	private static void differenceCapLen() {
		StringBuilder sb = new StringBuilder();
		sb.append("hello my");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

	
}

interface Inter {
	public void print();
	
}

class Test extends Object implements Inter {

	@Override
	public void print() {
		System.out.println("print");
	}
	
	public void run() {
		System.out.println("run");
	}
	
	public String toString() {
		return "��дtoString";
	}
	
}
