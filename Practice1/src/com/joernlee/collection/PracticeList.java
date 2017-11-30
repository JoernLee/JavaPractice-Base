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
					//交换元素-过程参照下面的交互
				}
			}
		}
	}

	private static void getOld() {
		/**
		 * 2,把集合中存储多个Person对象,Person有姓名和年龄,找出年龄最大的
			a,定义一个Person类型的变量, 先记住第一个元素
			b,循环遍历集合
			c,用每一个元素和变量比较年龄, 如果集合中的元素比变量记住的年龄大
			d,用变量记住这个年龄较大的元素
			e,返回变量记住的元素
		 */
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三", 30));
		list.add(new Person("李四", 50));
		list.add(new Person("王五", 40));
		list.add(new Person("赵六", 20));
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
		 * 1,定义一个方法swap()传入集合和两个索引使集合中元素交换位置
			a,定义一个临时变量, 记住其中一个元素
			b,用第一个位置存放第二个位置上的元素
			c, 用第二个位置存放临时变量记住的元素
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
