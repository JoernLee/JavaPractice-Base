package com.joernlee.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class ListLee {

	public static void main(String[] args) {
		/*集合常见方法：
		add方法：添加单一元素
		clear方法:清空集合，只是不指向对象，垃圾回收会回收
		contains方法：判断某个元素是否存在于此集合
		equals方法：不是拿集合和某个元素比较，而是集合和集合比较，比如对于List来说必须元素一样，而且有序顺序一样
		isEmpty方法：判断集合是否为空
		remove方法：删除某个元素，成功返回true，不成功false
		size方法：返回元素个数，就是底层那个数组长度
		toArray方法：集合转化成数组，可以遍历打印。*/
		//iterator();
		//listIterator();
		//removeDual(); 去掉重复字符串
		//去掉重复自定义对象-整体思路和上面一样，但是注意contains的方法，里面调用了indexOf方法，indexOf里面其实是调用了参数的equals方法进行遍历比较，所以自定义对象必须重写好自己的equals方法才能正常使用。否则用的是Object类的equals方法，比较地址值。
		//fore();
		//asListLee();
		
	}

	private static void asListLee() {
		String[] arr = {"a","b","c"};
		//System.out.println(arr.toString());
		List<String> list =  Arrays.asList(arr);		//数组转换成集合不能改变长度,但是可以应用集合中其他的方法
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
		//去掉List中重复字符串
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
		 * 比如有一个需求，去集合里面搜索到某个元素，如果存在元素A，就添加另一个元素B
			迭代器本身只有三个行法，hasNext，next和remove。
			如果直接用集合的add方法，会出现对象的并发修改异常，因为这里迭代器根据集合的长度去迭代的，但是这样集合有可能会自己增加元素，迭代器并不知情，两个对象在操作一个东西
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
