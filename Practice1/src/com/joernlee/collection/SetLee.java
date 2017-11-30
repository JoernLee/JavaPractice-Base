package com.joernlee.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

import com.joernlee.bean.Person;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Comparison;

public class SetLee {

	public static void main(String[] args) {
		//demo1();
		//demo2();
		//pratice1();
		//practice2();
		//demo3();
		//demo4();
		//demo5();
		
	}

	private static void demo5() {
		//ͨ���Զ���Ƚ�����������������
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("nba");
		ts.add("cba");
		ts.add("wnba");
		ts.add("czbk");
		ts.add("heima");
		ts.add("z");
		ts.add("aaaaaaaaaaaaaaaa");
		
		System.out.println(ts);
	}

	private static void demo4() {
		//TreeSet�洢�Զ������������Ҫ��дcompareTo����
		/*
		 * �ڶ���add������Ԫ�ػ����compareTo�����͵�һ��Ԫ�ؽ��бȽϣ���ʱ�������ֵ��1����ô��ŵ���һ�����ұߡ�
			�����������͵�һ���Ƚϣ�����1�������˵ڶ������͵ڶ����ٱȽϣ�����1����ʱ�ٶ��Ƕ�ֵ�����ŵ��˵ڶ������ұߣ��������ƣ������compareTo�������ض�ֵ1����ô�ͻᰴ��add˳��ȡ��������Ϊ������ֻ���ұ�һ����
			�������ֵд��-1�����涼���ڵ�һ����ߣ��Դ����ƣ�����ȡʱ��������
			�����0����ô�Ͳ����ģ�������д�Ķ�ֵ0��ֻ����ȥ��һ��
			��������Ҫ�ú������������ȡ���򣬱�������˵�����ȵȣ���Щ��������д��compareTo������ͬʱ�ж�Ψһ��Ҳ�������������
		 * 
		 * 
		 * */
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("Tom", 23));
		ts.add(new Person("john", 28));
		ts.add(new Person("black", 13));
		ts.add(new Person("xxxxxx", 33));
		ts.add(new Person("zzzzzz", 33));
		ts.add(new Person("wc", 53));
		ts.add(new Person("ccav", 50));
		
		System.out.println(ts);
	}

	private static void demo3() {
		//TreeSet���ԶԼ�����Ԫ������
		TreeSet<Integer> ts = new TreeSet<>();	//
		ts.add(5);
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(2);
		ts.add(4);
		ts.add(4);
		
		System.out.println(ts);
	}

	private static void practice2() {
		//ȥ��һ������������ظ�Ԫ��
		ArrayList<String> list = new ArrayList<>();
		list.add("x");
		list.add("x");
		list.add("x");
		list.add("y");
		list.add("y");
		list.add("z");
		list.add("zz");
		
		HashSet<String> hs = new HashSet<>();
		hs.addAll(list);
		System.out.println(hs);
		
		LinkedHashSet<String> hs2 = new LinkedHashSet<>();
		hs2.addAll(list);
		System.out.println(hs2);
		
		list.clear();
		list.addAll(hs2);
		System.out.println(list);
	}

	private static void pratice1() {
		//��ȡ���ظ������
		HashSet<Integer> hs = new HashSet<>();
		Random r = new Random();
		
		while(hs.size()<10){
			hs.add(r.nextInt(20) + 1);
		}
		
		for (Integer integer : hs) {
			System.out.println(integer);
		}
	}

	private static void demo2() {
		//������дhashCode��equals�������ܱ�֤�Զ������Ψһ��
		/*
		 * һ��hashset����add��ʱ����ȵ���hashCode������֮��hashCodeֵһ��ʱ��Ż����equals����������ִ��equals��������Ķ����ж�Ӧ�Ĺ�ϣֵ��
			����й�ϣֵ��ͬ�Ķ��󣬾ͺ͹�ϣֵ��ͬ�Ķ������ʹ��equals�����Ƚϣ��Ƚ�false�棬true�Ͳ����ȥ��
			�����Զ�����������HashSetȥ�ظ�Ҫע��
			���б�����дequals��hashCode����
			hashCode��Ҫ��������ͬ���󷵻�ֵ������ͬ�����Բ�ͬ����ֵ������ͬ�����Ч�ʣ�
			equals��������ͬ����true����ͬ����false����ͬʱ��洢
		 * 
		 * */
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		
		System.out.println(hs);
	}

	private static void demo1() {
		//��֤Ψһ��
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");			//���洢���ɹ���ʱ��,����false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(hs);
	}

}

class CompareByLen implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {			//�Ƚ��ַ����ĳ���
		int num = s1.length() - s2.length();			//������Ϊ��Ҫ����
		return num == 0 ? s1.compareTo(s2) : num;		//������Ϊ��Ҫ����
	}
}
