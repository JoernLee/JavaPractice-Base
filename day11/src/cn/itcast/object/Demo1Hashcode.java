package cn.itcast.object;

import cn.itcast.domain.Student;

public class Demo1Hashcode {
	public static void main(String[] args) {
		Student stu = new Student("Joern",24);
		String str = stu.toString();
		System.out.println(str);
	}
	

}
