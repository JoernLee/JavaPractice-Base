package com.joernlee.collection;

import java.util.ArrayList;
import java.util.List;

import com.joernlee.bean.Person;

public class PracticeList {

	public static void main(String[] args) {
		//swapLee();
		//getOld();
		
		

	}
	
	public static<E extends Comparable<E>> void sort(List<E> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i).compareTo(list.get(j)) > 0) {
					//����Ԫ��-���̲�������Ľ���
				}
			}
		}
	}

	private static void getOld() {
		/**
		 * 2,�Ѽ����д洢���Person����,Person������������,�ҳ���������
			a,����һ��Person���͵ı���, �ȼ�ס��һ��Ԫ��
			b,ѭ����������
			c,��ÿһ��Ԫ�غͱ����Ƚ�����, ��������е�Ԫ�رȱ�����ס�������
			d,�ñ�����ס�������ϴ��Ԫ��
			e,���ر�����ס��Ԫ��
		 */
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("����", 30));
		list.add(new Person("����", 50));
		list.add(new Person("����", 40));
		list.add(new Person("����", 20));
		Person old = list.get(0);
		for(int i = 0;i < list.size();i++){
			Person person = list.get(i);
			if(person.getAge() > old.getAge()){
				old = list.get(i);
			}
		}
		
		System.out.println(old);
	}

	private static void swapLee() {
		/**
		 * 1,����һ������swap()���뼯�Ϻ���������ʹ������Ԫ�ؽ���λ��
			a,����һ����ʱ����, ��ס����һ��Ԫ��
			b,�õ�һ��λ�ô�ŵڶ���λ���ϵ�Ԫ��
			c, �õڶ���λ�ô����ʱ������ס��Ԫ��
		 */
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("x");
		list1.add("y");
		list1.add("z");
		list1.add("v");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		
		int index1 = 1,index2 = 2;
		String temp = list1.get(index1);
		list1.set(index1, list2.get(index2));
		list2.set(index2, temp);
		
		System.out.println(list1);
		System.out.println(list2);
	}

}
