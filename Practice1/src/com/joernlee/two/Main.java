package com.joernlee.two;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//1.测试capacity和length区别
		//2.differenceCapLen();
		//3.StringBuffer/Builder类常用方法包括添加，删除，替换，反转，截取子串
		//4.Arrays类是对数组进行操纵，包括排序，字符串返回，查找等等
		
		//5.intergerProblem();
		/* 6.
		 * 接口也继承Object类是错的，因为接口里面方法都是抽象的，而object里面方法都不是抽象的，
		 * 如果接口是继承Object的，那么意味着接口里面可以定义非抽象方法了。
		 * 但是为什么能拿到toString方法？因为接口中有Object这个类所有方法的映射。
		 * 
		 * 
		 * */
		Inter i = new Test();			//父类引用指向子类对象
		i.print();
		//i.run(); 						//这个无法运行，因为父类接口里面没有这个抽象方法
		System.out.println(i.toString());
	}

	private static void intergerProblem() {
		//Integer类一个常见问题
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
		 * 当Integer直接赋值的范围是在-128到127之间,也就是一个byte的取值范围,不会创建多个对象
		 * 第一次Integer = -128,会在底层有一个数组存储-128到127之间的Integer对象值,直接从数组中获取Integer对象
		 * 第二次Integer = -128,不会重新创建对象,继续从数组中获取
		 * 与第一个不同的是，第一个是new了，肯定是不同对象，但是第三个就是靠底层优化了，小于byte，从底层数组里面直接取了。
		 */
		
		Integer[] arr = {new Integer(-128),127,-126};	//数组中可以存储引用数据类型
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
		return "重写toString";
	}
	
}
