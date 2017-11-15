package cn.itcast.test;

import java.util.Scanner;

public class Test4String {

	/**
	 * @param args
	 * 需求：把字符串反转
	 * 录入abc，输出cba
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String line = sc.nextLine();	
		char[] arr = line.toCharArray();
		
		String temp = "";
		for(int i = arr.length-1; i >= 0; i--){
			temp = temp + arr[i];
		}
		System.out.println(temp);
	}

}
