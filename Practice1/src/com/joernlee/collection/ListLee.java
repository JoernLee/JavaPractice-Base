package com.joernlee.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class ListLee {

	public static void main(String[] args) {
		/*���ϳ���������
		add��������ӵ�һԪ��
		clear����:��ռ��ϣ�ֻ�ǲ�ָ������������ջ����
		contains�������ж�ĳ��Ԫ���Ƿ�����ڴ˼���
		equals�����������ü��Ϻ�ĳ��Ԫ�رȽϣ����Ǽ��Ϻͼ��ϱȽϣ��������List��˵����Ԫ��һ������������˳��һ��
		isEmpty�������жϼ����Ƿ�Ϊ��
		remove������ɾ��ĳ��Ԫ�أ��ɹ�����true�����ɹ�false
		size����������Ԫ�ظ��������ǵײ��Ǹ����鳤��
		toArray����������ת�������飬���Ա�����ӡ��*/
		//iterator();
		//listIterator();
		//removeDual(); ȥ���ظ��ַ���
		//ȥ���ظ��Զ������-����˼·������һ��������ע��contains�ķ��������������indexOf������indexOf������ʵ�ǵ����˲�����equals�������б����Ƚϣ������Զ�����������д���Լ���equals������������ʹ�á������õ���Object���equals�������Ƚϵ�ֵַ��
		//fore();
		//asListLee();
		
	}

	private static void asListLee() {
		String[] arr = {"a","b","c"};
		//System.out.println(arr.toString());
		List<String> list =  Arrays.asList(arr);		//����ת���ɼ��ϲ��ܸı䳤��,���ǿ���Ӧ�ü����������ķ���
		System.out.println(list);
		//list.add("d");
	}

	private static void fore() {
		ArrayList<String> list = new ArrayList<>();
		list.add("x");
		list.add("y");
		list.add("y");
		list.add("z");
		list.add("z");
		list.add("z");
		
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void removeDual() {
		//ȥ��List���ظ��ַ���
		ArrayList<String> list = new ArrayList<>();
		list.add("x");
		list.add("y");
		list.add("y");
		list.add("z");
		list.add("z");
		list.add("z");
		
		ListIterator<String> lit = list.listIterator();
		ArrayList<String> newList = new ArrayList<>();
		while(lit.hasNext()){
			String temp = lit.next();
			if(!newList.contains(temp)){
				newList.add(temp);
			}
		}
		System.out.println(newList);
	}

	private static void listIterator() {
		/*
		 * ������һ������ȥ��������������ĳ��Ԫ�أ��������Ԫ��A���������һ��Ԫ��B
			����������ֻ�������з���hasNext��next��remove��
			���ֱ���ü��ϵ�add����������ֶ���Ĳ����޸��쳣����Ϊ������������ݼ��ϵĳ���ȥ�����ģ��������������п��ܻ��Լ�����Ԫ�أ�����������֪�飬���������ڲ���һ������
		 * */
		ArrayList<String> list = new ArrayList<>();
		list.add("x");
		list.add("y");
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String str = (String) lit.next();
			if(str.equals("x")){
				lit.add("zzz");
			}
		}
		System.out.println(list.toString());
	}

	private static void iterator() {
		Collection<String> c = new ArrayList<>();
		c.add("x");
		c.add("y");
		c.add("z");
		
		Iterator<String> it2 = c.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}
	

}
