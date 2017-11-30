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
		//通过自定义比较器来设置排序条件
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
		//TreeSet存储自定义对象排序需要重写compareTo方法
		/*
		 * 第二个add进来的元素会调用compareTo方法和第一个元素进行比较，此时如果返回值是1，那么会放到第一个的右边。
			第三个进来和第一个比较，返回1，看到了第二个，和第二个再比较，返回1（此时假定是定值），放到了第二个的右边，依次类推，如果你compareTo方法返回定值1，那么就会按你add顺序取出来，因为二叉树只有右边一条。
			如果返回值写定-1，后面都放在第一个左边，以此类推，所以取时候是逆序。
			如果是0，那么就不会存的，所以你写的定值0，只会存进去第一个
			所以我们要好好利用这个方法取排序，比如根据人的年龄等等，这些就依赖重写的compareTo方法（同时判断唯一性也依赖这个方法）
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
		//TreeSet可以对集合中元素排序
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
		//去掉一个集合里面的重复元素
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
		//获取不重复随机数
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
		//必须重写hashCode和equals方法才能保证自定义对象唯一性
		/*
		 * 一个hashset对象，add的时候会先调用hashCode方法，之后当hashCode值一样时候才会调用equals方法，否则不执行equals。（存入的对象都有对应的哈希值）
			如果有哈希值相同的对象，就和哈希值相同的对象逐个使用equals方法比较，比较false存，true就不存进去。
			对于自定义类对象存入HashSet去重复要注意
			类中必须重写equals和hashCode方法
			hashCode：要求：属性相同对象返回值必须相同，属性不同返回值尽量不同（提高效率）
			equals：属性相同返回true，不同返回false，不同时候存储
		 * 
		 * */
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三", 23));
		hs.add(new Person("张三", 23));
		hs.add(new Person("李四", 23));
		hs.add(new Person("李四", 23));
		hs.add(new Person("王五", 23));
		hs.add(new Person("赵六", 23));
		
		System.out.println(hs);
	}

	private static void demo1() {
		//保证唯一性
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");			//当存储不成功的时候,返回false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(hs);
	}

}

class CompareByLen implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {			//比较字符串的长度
		int num = s1.length() - s2.length();			//长度作为主要条件
		return num == 0 ? s1.compareTo(s2) : num;		//内容作为次要条件
	}
}
