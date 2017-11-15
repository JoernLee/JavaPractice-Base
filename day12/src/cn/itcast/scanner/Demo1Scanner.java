package cn.itcast.scanner;

import java.util.Scanner;

public class Demo1Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //System.in是标准输入流
		/*//判断sc接收的是不是int数
		if(sc.hasNextInt()){
			int x = sc.nextInt();
			System.out.println(x);
		}else{
			System.out.println("输入错误");
		}*/
		
		//键盘录入两个字符串
		System.out.println("输入第一个字符串");
		String line1 = sc.nextLine();
		System.out.println("输入第二个字符串");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + "line2 = " + line2);
		
		
	}

}
